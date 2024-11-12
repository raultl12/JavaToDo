
package todo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskManager {
    private ArrayList<Task> allTasks;
    private static int lastTaskId;
    
    public TaskManager(){
        allTasks = new ArrayList<>();
        lastTaskId = 0;
    }
    
    public void addTask(Task task){
        allTasks.add(task);
        lastTaskId++;
    }
    
    public void deleteTask(int taskId){
        allTasks.remove(taskId);
    }
    
    public static int getLastTaskId(){
        return TaskManager.lastTaskId;
    }
    
    public void printTasks(){
        if(allTasks.isEmpty()){
            System.out.println("No hay tareas.");
            return;
        }
        System.out.println(this.tasksToString());
    }
    
    public String tasksToString(){
        String txt = Integer.toString(lastTaskId) + "\n\n";
        for(Task t : allTasks){
            txt += t.getId() + "\n" + t.getDescription() + "\n" +
                    t.isCompleted() + "\n\n";
        }
        return txt;
    }
    
    public void saveData(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Tasks.txt"));
            writer.write(this.tasksToString());
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readData(){
        // TODO: Read file data and convert to tasks.
    }
}
