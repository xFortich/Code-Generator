/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import controlator.StringSplitterToDoEverithing;
import modelo.Parser;
import java.util.HashMap;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author fortich
 */
public class MainFrame extends javax.swing.JFrame {

    public static StringSplitterToDoEverithing splitter = new StringSplitterToDoEverithing();
    public InstructionSetChanger isc = new InstructionSetChanger();
    
    public MainFrame() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        areaToWrite = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        machineCodeBox = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        constantsArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        machineCodeBoxReadyToCopy = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lengthList = new javax.swing.JComboBox<>();
        assembleButtom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        memoryLenghtArea = new javax.swing.JTextArea();
        instructionSetButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaToWrite.setColumns(20);
        areaToWrite.setRows(5);
        areaToWrite.setText("inA\nstoreA X\ninA\nstoreA Y\nloadA X\naddA Y\nstoreA S\nloadA S\noutA S\nFIN loadA ONE\nJPOS FIN");
        jScrollPane1.setViewportView(areaToWrite);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 40, -1, 260));

        jLabel1.setText("Assembly");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel2.setText("Machine Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 20));

        machineCodeBox.setColumns(20);
        machineCodeBox.setRows(5);
        jScrollPane3.setViewportView(machineCodeBox);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 260, 260));

        constantsArea.setColumns(20);
        constantsArea.setRows(5);
        constantsArea.setText("ONE 01");
        jScrollPane4.setViewportView(constantsArea);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 140));

        jLabel5.setText("Constants");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 306, -1, 30));

        machineCodeBoxReadyToCopy.setColumns(20);
        machineCodeBoxReadyToCopy.setRows(5);
        jScrollPane2.setViewportView(machineCodeBoxReadyToCopy);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 260, 140));

        jLabel3.setText("Machine Code - Ready to copy");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 220, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 560, 520));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Instruction length");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 25));

        lengthList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1 Byte", "2 Byte"}));
        lengthList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthListActionPerformed(evt);
            }
        });
        jPanel3.add(lengthList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 75, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 140, 120));

        assembleButtom.setText("Assemble");
        assembleButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assembleButtomActionPerformed(evt);
            }
        });
        getContentPane().add(assembleButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 160, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Memory size");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        memoryLenghtArea.setColumns(20);
        memoryLenghtArea.setRows(1);
        memoryLenghtArea.setText("\n\n32");
        memoryLenghtArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane5.setViewportView(memoryLenghtArea);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 140, 90));

        instructionSetButtom.setText("Instruction Set");
        instructionSetButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionSetButtomActionPerformed(evt);
            }
        });
        getContentPane().add(instructionSetButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lengthListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthListActionPerformed

    private void assembleButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assembleButtomActionPerformed
        String instructions = areaToWrite.getText();
        String constants = constantsArea.getText();
        int bytes = lengthList.getSelectedIndex()+1;
        int memoryLenght = 32;
        try{
            memoryLenght = Integer.parseInt(memoryLenghtArea.getText());
        }catch(Exception e){
            memoryLenghtArea.setText("32");
        }
        String[] answers = splitter.toMachineCode(instructions, constants, bytes, memoryLenght);
        machineCodeBox.setText(answers[0]);
        machineCodeBoxReadyToCopy.setText(answers[1]);
    }//GEN-LAST:event_assembleButtomActionPerformed

    private void instructionSetButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionSetButtomActionPerformed
        isc.setTextInstructionTextArea(splitter.getInstructionsOnString());
        this.isc.setVisible(true);
    }//GEN-LAST:event_instructionSetButtomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaToWrite;
    private javax.swing.JButton assembleButtom;
    private javax.swing.JTextArea constantsArea;
    private javax.swing.JButton instructionSetButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> lengthList;
    private javax.swing.JTextArea machineCodeBox;
    private javax.swing.JTextArea machineCodeBoxReadyToCopy;
    private javax.swing.JTextArea memoryLenghtArea;
    // End of variables declaration//GEN-END:variables
}