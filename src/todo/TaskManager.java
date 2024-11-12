
package todo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskManager {
    private ArrayList<Task> allTasks;
    private static int lastTaskId;
    
    public TaskManager(){
        allTasks = this.readData();
        //allTasks = new ArrayList<>();
        //lastTaskId = 0;
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
        String txt = Integer.toString(TaskManager.lastTaskId) + "\n";
        for(Task t : allTasks){
            txt += t.getId() + "\n" + t.getDescription() + "\n" +
                    t.isCompleted() + "\n";
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
    
    public ArrayList<Task> readData(){
        ArrayList<Task> taskArray = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Tasks.txt"));
            //Read lines and create individual task
            String line;
            int taskId = 0;
            String taskDescription = "";
            boolean taskCompleted = false;
            
            int lineCounter = 0;
            
            TaskManager.lastTaskId = Integer.valueOf(reader.readLine());
            
            while((line = reader.readLine()) != null){
                switch(lineCounter){
                    case 0:
                        taskId = Integer.valueOf(line);
                        break;
                    case 1:
                        taskDescription = line;
                        break;
                    case 2:
                        taskCompleted = Boolean.getBoolean(line);
                        Task newTask = new Task(taskId, taskDescription, taskCompleted);
                        taskArray.add(newTask);
                        lineCounter = -1;
                }
                lineCounter++;
                

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return taskArray;
    }
}
