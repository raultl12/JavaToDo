
package todo;

import java.util.Scanner;

public class ToDo {
    
    private static TaskManager taskManager;
    
    
    public static void main(String[] args) {
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        
        taskManager = new TaskManager();
        
        while (true){
            System.out.println("Elige una opcion:");
            System.out.println("1. Añadir una tarea.");
            System.out.println("2. Ver tareas.");
            System.out.println("3. Borrar una tarea.");
            System.out.println("4. Guardar y salir.");
            
            try {
                option = keyboard.nextInt();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            
            
            
            if(option == 4){
                taskManager.saveData();
                break;
            }
            
            switch(option){
                case 1:
                    System.out.println("Opcion 1");
                    Task newTask = new Task(TaskManager.getLastTaskId());
                    taskManager.addTask(newTask);
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    taskManager.printTasks();
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    //taskManager.deleteTask(id);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
