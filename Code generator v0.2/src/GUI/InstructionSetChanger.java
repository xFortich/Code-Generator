/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.ImageIcon;
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
        try{
        setIconImage(new ImageIcon(getClass().getResource("/GUI/icon.png")).getImage());
        }catch(Exception e){System.out.println("notfound");}
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
        jLabel1 = new javax.swing.JLabel();
        changeButtom = new javax.swing.JButton();
        defaultButtom = new javax.swing.JButton();
        closeButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructionTextArea = new javax.swing.JTextArea();

        setTitle("Edit Instructions");
        setMinimumSize(new java.awt.Dimension(260, 460));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Instruction set");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        changeButtom.setText("Change");
        changeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtomActionPerformed(evt);
            }
        });
        jPanel1.add(changeButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        defaultButtom.setText("Default");
        defaultButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButtomActionPerformed(evt);
            }
        });
        jPanel1.add(defaultButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        closeButtom.setText("Close");
        closeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtomActionPerformed(evt);
            }
        });
        jPanel1.add(closeButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        instructionTextArea.setColumns(19);
        instructionTextArea.setRows(5);
        jScrollPane1.setViewportView(instructionTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 440));

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

    private void defaultButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultButtomActionPerformed
        // TODO add your handling code here:
        
        String defaultis = "loadA 00\nstoreA 20\naddA 40\nsubA 60\ninA 80\noutA A0\nJZ C0\nJPOS E0";        
        setTextInstructionTextArea(defaultis);
    }//GEN-LAST:event_defaultButtomActionPerformed
    
    public void setTextInstructionTextArea (String s){
        instructionTextArea.setText(s);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeButtom;
    private javax.swing.JButton closeButtom;
    private javax.swing.JButton defaultButtom;
    private javax.swing.JTextArea instructionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}