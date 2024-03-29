package remote;

import com.hazelcast.core.HazelcastInstance;
import global.Task;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

import static global.Utils.exceptionStacktraceToString;
import static remote.Utils.instantiate;
import static remote.Utils.sendBack;
import static remote.Utils.sendBackError;


public class TaskClazz implements Callable<Object> {

    private final String id;
    Task task;
    private String targetFunction;
    private Method method;

    public TaskClazz(String id, String clasz, HazelcastInstance hazelcastInstance){
        this.id=id;
        task = instantiate(clasz, Task.class);
        task.setJvmID(Controler.ID);
        task.setTaskID(id);
        task.setHazelcastInstance(hazelcastInstance);
    }

    public void setMethod(String function){
        targetFunction = function;
        try {
            method = task.getClass().getMethod(function);
        } catch (NoSuchMethodException e) {
            method = null;
            onException(e);
        }
    }

    public void stop(){
        task.setRunning(false);
    }


    //TODO KEEP track of number of threads exicuting a task method in a map
    //key taskId-method value thread count
    public Object call() {
        try {
            if (method!=null) {
                System.out.println(infoStart());
                sendBack(infoStart());
                task.setRunning(true);
                method.invoke(task);
                sendBack(infoStop());
                System.out.println(infoStop());
            }
        }catch (Throwable e){
            onException(e);
            throw new RuntimeException( e );
        }
        return null;
    }

    //TODO write exception out to file
    private void onException(Throwable e){
        e.printStackTrace();
        sendBackError(infoString() + " " +  exceptionStacktraceToString(e) );
    }


    protected String getId(){
        return task.getTaskID();
    }

    protected String infoStart(){ return infoString() + " started"; }

    protected String infoStop(){ return infoString() +  " stopped"; }

    protected String infoString(){
        return Controler.ID+" "+ task.getTaskID()+" "+ task.getClass().getName()+" "+targetFunction;
    }


    @Override
    public String toString() {
        return "TaskClazz{" +
                "task=" + task +
                ", method=" + method +
                '}';
    }
}