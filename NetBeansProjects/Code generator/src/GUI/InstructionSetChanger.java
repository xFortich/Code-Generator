/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author fortich
 */
public class InstructionSetChanger extends javax.swing.JFrame {

    /**
     * Creates new form InstructionSetChanger
     */
    public InstructionSetChanger() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructionTextArea = new javax.swing.JTextArea();
        changeButtom = new javax.swing.JButton();
        closeButtom = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(260, 500));
        setPreferredSize(new java.awt.Dimension(270, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Instruction set");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        instructionTextArea.setColumns(19);
        instructionTextArea.setRows(5);
        jScrollPane1.setViewportView(instructionTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 420));

        changeButtom.setText("Change");
        changeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtomActionPerformed(evt);
            }
        });
        getContentPane().add(changeButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        closeButtom.setText("Close");
        closeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtomActionPerformed(evt);
            }
        });
        getContentPane().add(closeButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtomActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeButtomActionPerformed

    private void changeButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtomActionPerformed
        int line = MainFrame.splitter.setInstructionSetByString(instructionTextArea.getText());
        if(line != -1){
            JOptionPane.showMessageDialog(this, "Problema en la línea " + line + ".");
        }else{
            JOptionPane.showMessageDialog(this, "Instruction set cargado correctamente.");
            this.setVisible(false);
        }
    }//GEN-LAST:event_changeButtomActionPerformed
    
    public void setTextInstructionTextArea (String s){
        instructionTextArea.setText(s);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeButtom;
    private javax.swing.JButton closeButtom;
    private javax.swing.JTextArea instructionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}