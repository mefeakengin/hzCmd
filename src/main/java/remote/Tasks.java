package remote;

import com.hazelcast.core.HazelcastInstance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static remote.Utils.sendBack;
import static remote.Utils.sendBackError;

public class Tasks {
    private Map<String, Task> tasks = new HashMap();
    private ExecutorService executorService =  Executors.newCachedThreadPool();

    private HazelcastInstance hazelcastInstance;


    public Tasks(HazelcastInstance hazelcastInstance) {
        this.hazelcastInstance = hazelcastInstance;
    }

    public void submit(String function) throws InterruptedException, ExecutionException {
        for(Task t : tasks.values()){
            t.setMethod(function);
            if(t.willExicute())
                executorService.submit(t);
        }
    }

    public void invoke(String function) throws InterruptedException, ExecutionException {
        Collection<Task> running = new ArrayList();

        for(Task t : tasks.values()){
            t.setMethod(function);
            if(t.willExicute())
                running.add(t);
        }
        executorService.invokeAll(running);
        sendBack("all "+function+" finished");
    }

    public void stop(){
        for(Task t : tasks.values()){
            t.stop();
        }
    }

    public void loadClass(String taskId, String className){

        if(tasks.containsKey(taskId)){
            sendBackError("duplicate task ID "+taskId);
            return;
        }

        try{
            Task task = new Task(taskId, className, hazelcastInstance);
            tasks.put(task.getId(), task);
        } catch (Exception e){
            sendBackError("id="+taskId+" className="+className+" "+e.getMessage());
        }
    }

    @Override
    public String toString() {

        String str = new String();

        for(Task t : tasks.values()){
            str+=t+", ";
        }

        return "Tasks{" +
                ", tasks=" + str +
                '}';
    }
}