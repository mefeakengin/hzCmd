package cmdline;

import local.HzCmd;

@com.github.rvesse.airline.annotations.Command(name="info", description = "print info on managed boxes/clusters/jvm's")
public class Info extends Command {

    public void exe(HzCmd hzCmd) {
        System.out.println(hzCmd);
    }
}