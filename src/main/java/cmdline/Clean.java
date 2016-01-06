package cmdline;

import com.github.rvesse.airline.annotations.Option;
import global.HzType;
import local.HzCmd;

@com.github.rvesse.airline.annotations.Command(name = "clean", description = "clean cluster/members/clients")
public class Clean extends Command
{
    @Option(name = "-cluster", description = "cluster id to kill, * for ALL")
    public String cluster;

    @Option(name = "-m", description = "member id to kill, * for ALL")
    public String member;

    @Option(name = "-c", description = "client id to kill, * for ALL")
    public String client;


    public void exe(HzCmd hzCmd) {

        if(client!=null){
            try {
                hzCmd.clean(cluster, HzType.Client + client);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(member!=null){
            try {
                hzCmd.clean(cluster, HzType.Member + member);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}