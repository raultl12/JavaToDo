
package todo;

import GUI.MainWindow;
import java.util.Scanner;
import javax.swing.JFrame;

public class ToDo {
    
    private static TaskManager taskManager;
    private static MainWindow window;
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        window = new MainWindow();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                window.setSize(500, 900); // << not working!!!
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true); // make window visible
//                window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//                window.setVisible(true);
            }
        });
    }
//    public static void main(String args[])
//        int option = 0;
//        Scanner keyboard = new Scanner(System.in);
//        
//        taskManager = new TaskManager();
//        
//        while (true){
//            System.out.println("Elige una opcion:");
//            System.out.println("1. Añadir una tarea.");
//            System.out.println("2. Ver tareas.");
//            System.out.println("3. Borrar una tarea.");
//            System.out.println("4. Guardar y salir.");
//            
//            try {
//                option = keyboard.nextInt();
//            } catch (Exception e) {
//                System.out.println(e.getLocalizedMessage());
//            }
//            
//            
//            
//            if(option == 4){
//                taskManager.saveData();
//                break;
//            }
//            
//            switch(option){
//                case 1:
//                    System.out.println("Opcion 1");
//                    Task newTask = new Task(TaskManager.getLastTaskId());
//                    taskManager.addTask(newTask);
//                    break;
//                case 2:
//                    System.out.println("Opcion 2");
//                    taskManager.printTasks();
//                    //taskManager.readData();
//                    break;
//                case 3:
//                    System.out.println("Opcion 3");
//                    //taskManager.deleteTask(id);
//                    break;
//                default:
//                    System.out.println("Opcion no valida");
//                    break;
//            }
//        }
//    }
}
