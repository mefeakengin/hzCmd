package xml;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import global.Bash;
import local.Box;
import local.ClusterManager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class HzXml {

    public static final String xmlDir="xml";
    static {
        try {
            Bash.mkdir(xmlDir);
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }

    public static final String memberXml = "hazelcast.xml";
    public static final String clientXml = "client-hazelcast.xml";

    public static void makeMemberXml(ClusterManager m) throws Exception{

        Document document = getDocument(memberXml);

        addGroupElement(m, document);

        for (Box box : m.getBoxManager().getBoxList()) {
            Element member = document.createElement("member");
            member.setTextContent(box.pri);
            document.getElementsByTagName("tcp-ip").item(0).appendChild(member);
        }

        writeXmlFile(document, memberXml(m));
    }


    public static void addManCenter(String file, String ip) throws Exception{

        Document document = getDocument(file);

        Element mc = document.createElement("management-center");
        mc.setAttribute("enabled", "true");
        mc.setTextContent("http://"+ ip +":8080/mancenter");
        document.getFirstChild().appendChild(mc);


        writeXmlFile(document, file);
    }


    public static void wanReplication(ClusterManager a,  ClusterManager b, String name, String repImpl) throws Exception{

        Document document = getDocument(memberXml(a));

        Element wan = document.createElement("wan-replication");
        wan.setAttribute("name", name);

        Element target = document.createElement("target-cluster");
        target.setAttribute("group-name", b.getClusterId());
        target.setAttribute("group-password", b.getClusterId());

        Element rep = document.createElement("replication-impl");
        rep.setTextContent(repImpl);

        Element end = document.createElement("end-points");
        for (Box box : b.getBoxManager().getBoxList()) {
            Element address = document.createElement("address");
            address.setTextContent(box.pri);
            end.appendChild(address);
        }

        wan.appendChild(target);
        target.appendChild(rep);
        target.appendChild(end);

        document.getFirstChild().appendChild(wan);

        writeXmlFile(document, memberXml(a));
    }



    /*
    <wan-replication name="wanReplication">
        <target-cluster group-name="group2" group-password="pass">
            <replication-impl>
                com.hazelcast.enterprise.wan.replication.WanNoDelayReplication
            </replication-impl>
            <end-points>
                <address>10.0.0.162</address>
                <address>10.0.0.163</address>
            </end-points>
        </target-cluster>
        <target-cluster group-name="group3" group-password="pass">
            <replication-impl>
                com.hazelcast.enterprise.wan.replication.WanNoDelayReplication
            </replication-impl>
            <end-points>
                <address>10.0.0.161</address>
                <address>10.0.0.166</address>
            </end-points>
        </target-cluster>
    </wan-replication>
    */

    public static void makeClientXml(ClusterManager m) throws Exception{

        Document document = getDocument(clientXml);

        addGroupElement(m, document);

        for (Box box : m.getBoxManager().getBoxList()) {
            Element member = document.createElement("address");
            member.setTextContent(box.pri);
            document.getElementsByTagName("cluster-members").item(0).appendChild(member);
        }

        writeXmlFile(document, clientXml(m));
    }


    private static void addGroupElement(ClusterManager m, Document document) {
        document.getElementsByTagName("name").item(0).setTextContent(m.getClusterId());
        Element pass = document.createElement("password");
        pass.setTextContent(m.getClusterId());
        document.getElementsByTagName("group").item(0).appendChild(pass);
    }

    private static Document getDocument(String file) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }

    private static void writeXmlFile(Document document, String file) throws TransformerException {
        document.normalizeDocument();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);

        StreamResult streamResult = new StreamResult(new File(file));
        transformer.transform(domSource, streamResult);
    }

    public static String memberXml(ClusterManager m ){
        return xmlDir+"/"+m.getClusterId()+"-"+ memberXml;
    }

    public static String clientXml(ClusterManager m ){
        return xmlDir+"/"+m.getClusterId()+"-"+ clientXml;
    }
}