/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author raul
 */
public class TaskPanel extends javax.swing.JPanel {

    /**
     * Creates new form TaskPanel
     */
    public TaskPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        taskCompleted = new javax.swing.JCheckBox();
        deleteTaskButton = new javax.swing.JButton();
        taskDescription = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        taskCompleted.setText("Done");
        taskCompleted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(taskCompleted, java.awt.BorderLayout.CENTER);

        deleteTaskButton.setText("Delete");
        jPanel1.add(deleteTaskButton, java.awt.BorderLayout.PAGE_END);

        add(jPanel1, java.awt.BorderLayout.LINE_END);

        taskDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskDescription.setText("This is the description of the task");
        add(taskDescription, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteTaskButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox taskCompleted;
    private javax.swing.JLabel taskDescription;
    // End of variables declaration//GEN-END:variables
}
