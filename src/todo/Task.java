
package todo;

import java.util.Scanner;

public class Task {
    private int id;
    private String description;
    private boolean completed;
    
    
    private void insertData(){
        String text = "";
        Scanner keyboard = new Scanner(System.in);
        
        try {
            text = keyboard.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }       
        
        this.setDescription(text);
    }
    
    public Task(int id){
        this.id = id;   
        this.completed = false;
        this.insertData();
    }
    
    public Task(int id, String description){
        this.id = id;
        this.description = description;
        this.completed = false;
    }
    
    public Task(int id, String description, boolean completed){
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
