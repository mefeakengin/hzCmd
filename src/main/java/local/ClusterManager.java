package local;

import global.Args;
import global.Bash;
import global.HzType;
import xml.HzXml;

import java.io.*;
import java.util.*;

import static global.Utils.rangeMap;
import static global.Utils.sleepSeconds;
import static xml.HzXml.clientXml;
import static xml.HzXml.memberXml;

public class ClusterManager implements Serializable {

    private final String clusterId;
    private BoxManager boxes;
    private Map<String, RemoteJvm> jvms = new HashMap();

    private int membersOnlyCount;
    private int memberCount=0;
    private int clientCount=0;
    private String homeIp;

    public ClusterManager(String clusterId, BoxManager boxes, String homeIp) throws Exception {
        this.clusterId =clusterId;
        this.boxes=boxes;
        this.homeIp=homeIp;
        HzXml.makeMemberXml(this);
        HzXml.makeClientXml(this);
    }

    private ClusterManager(String clusterId, BoxManager boxes, int memberCount, int clientCount, String homeIp) throws Exception {
        this.clusterId =clusterId;
        this.boxes=boxes;
        this.memberCount=memberCount;
        this.clientCount=clientCount;
        this.homeIp=homeIp;
    }

    public String getClusterId() {
        return clusterId;
    }

    public BoxManager getBoxManager( ){
        return boxes;
    }

    public ClusterManager selectJvmSet(String jvmId) throws Exception {
        if( jvmId.equals( "Member*" ) )
            return getMemberManager();

        if( jvmId.equals( "Client*" ) )
            return getClientManager();

        return getIDManager( jvmId + getClusterId() );
    }

    public ClusterManager getMemberManager() throws Exception {
        ClusterManager selected = new ClusterManager(clusterId, boxes, memberCount, clientCount, homeIp);
        for(RemoteJvm jvm : this.jvms.values()){
            if(jvm.isMember()){
                selected.jvms.put(jvm.getId(), jvm);
            }
        }
        return selected;
    }

    public ClusterManager getClientManager() throws Exception {
        ClusterManager selected = new ClusterManager(clusterId, boxes, memberCount, clientCount, homeIp);
        for(RemoteJvm jvm : this.jvms.values()){
            if(jvm.isClient()){
                selected.jvms.put(jvm.getId(), jvm);
            }
        }
        return selected;
    }

    public ClusterManager getIDManager(String id) throws Exception {
        ClusterManager selected = new ClusterManager(clusterId, boxes, memberCount, clientCount, homeIp);
        selected.jvms.put(id, this.jvms.get(id));
        return selected;
    }

    public void setMembersOnlyCount(int count) {
        if(count < 0 || count > boxes.size()){
            membersOnlyCount=0;
        }else{
            membersOnlyCount = count;
        }
    }

    public void addMembers(int qty, String hzVersion, String options) throws IOException, InterruptedException {
        List<RemoteJvm> check = new ArrayList();
        for(int i=0; i<qty; i++) {
            check.add(addMember(hzVersion, options));
        }
        sleepSeconds(2);
        for (RemoteJvm jvm : check) {
            System.out.println(jvm);
        }
    }

    public RemoteJvm addMember(String hzVersion, String options) throws IOException, InterruptedException {
        int memberIdx = rangeMap(memberCount++, 0, boxes.size()-membersOnlyCount);

        String id = HzType.Member.name() + memberCount + clusterId;

        RemoteJvm jvm = new RemoteJvm(boxes.get(memberIdx), HzType.Member, id, memberXml(this), homeIp);
        jvms.put(jvm.getId(), jvm);
        jvm.initilize(hzVersion, options);
        return jvm;
    }

    public void addClients(int qty, String hzVersion, String options) throws IOException, InterruptedException {
        List<RemoteJvm> check = new ArrayList();
        for(int i=0; i<qty; i++) {
            check.add(addClient(hzVersion, options));
        }
        sleepSeconds(2);
        for (RemoteJvm jvm : check) {
            System.out.println(jvm);
        }
    }

    public RemoteJvm addClient(String hzVersion, String options) throws IOException, InterruptedException {
        int clientIdx = rangeMap(clientCount++, membersOnlyCount, boxes.size());
        String id = HzType.Client.name() + clientCount + clusterId;
        RemoteJvm jvm = new RemoteJvm(boxes.get(clientIdx), HzType.Client, id, clientXml(this), homeIp);
        jvms.put(jvm.getId(), jvm);
        jvm.initilize(hzVersion, options);
        return jvm;
    }

    private void sendToAll(String cmd) throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            jvm.send(cmd);
        }
    }

    public void load(String taskId, String className) throws IOException, InterruptedException {
        sendToAll(Args.load + " " + taskId + " " + className);
    }

    public void invoke(int threadCount, String method, String taskId) throws IOException, InterruptedException {
        sendToAll(Args.invoke + " " + threadCount + " " + method + " " + taskId);
    }

    public void stop(String taskId) throws IOException, InterruptedException {
        sendToAll(Args.stop +" " + taskId);
    }



    public void restart(String version, String options) throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            jvm.initilize(version, options);
        }
    }

    public void clean() throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            jvm.clean();
        }
    }

    public void kill() throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            jvm.kill();
        }
    }

    public void info() throws IOException, InterruptedException {
        System.out.println(this);
    }

    public void cat() throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            System.out.println(jvm);
            System.out.println(jvm.cat());
        }
    }

    public void tail() throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            System.out.println(jvm);
            jvm.tail();
        }
    }


    public void grep(String args) throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            System.out.println(jvm);
            System.out.println(jvm.grep(args));
        }
    }

    public void downlonad(String destDir) throws IOException, InterruptedException {
        checkEmpty();
        for(RemoteJvm jvm : jvms.values()){
            jvm.downlonad(destDir);
        }
    }


    private String toString_memberJvms(){
        String jvms = new String();
        for(RemoteJvm jvm : this.jvms.values()){
            if(jvm.isMember()){
                jvms+=jvm+"\n";
            }
        }
        return jvms;
    }

    private String toString_clientJvms(){
        String jvms = new String();
        for(RemoteJvm jvm : this.jvms.values()){
            if(jvm.isClient()){
                jvms+=jvm+"\n";
            }
        }
        return jvms;
    }

    public void clearStoped(){
        Iterator<Map.Entry<String,RemoteJvm>> i = jvms.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<String, RemoteJvm> e = i.next();
            RemoteJvm jvm = e.getValue();
            if(! jvm.running()){
                if(jvm.isMember()){
                    this.memberCount--;
                }else{
                    this.clientCount--;
                }
                i.remove();
            }
        }
    }

    private void checkEmpty(){
        if(jvms.isEmpty()){
            System.out.println(Bash.ANSI_RED+"operation on empty cluster"+Bash.ANSI_RESET);
        }
    }

    @Override
    public String toString() {

        String jvms = toString_memberJvms();
        jvms += toString_clientJvms();

        return Bash.ANSI_YELLOW+"ClusterManager" +
                " clusterId=" + clusterId +
                ", membersOnlyCount=" + membersOnlyCount +
                ", memberCount=" + memberCount +
                ", clientCount=" + clientCount +
                ", boxCount=" + boxes.size() +
                ", " + boxes +
                "" + jvms +
                Bash.ANSI_RESET;
    }
}