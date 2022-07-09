
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAA
 */
public class EditAlarmDialog extends javax.swing.JDialog {

    /** Creates new form EditAlarmDialog */
    private ArrayList<Time> alarms;
    private ArrayList<JCheckBox> jCheckBoxs;
    public EditAlarmDialog(java.awt.Frame parent, boolean modal,ArrayList<Time> alarms) {
        super(parent, modal);
        initComponents();
        this.alarms = alarms;
        jCheckBoxs = new ArrayList<>();
        jPanel1.setLayout(new GridLayout(alarms.size(),1));
        displayAlarms();
    }

    private EditAlarmDialog(JFrame jFrame, boolean b) {
        super(jFrame, b);
        getContentPane().setBackground(Color.black);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Alarm");

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        removeBtn.setBackground(new java.awt.Color(0, 0, 0));
        removeBtn.setForeground(new java.awt.Color(0, 0, 0));
        removeBtn.setText("Remove");
        removeBtn.setOpaque(false);
        removeBtn.setContentAreaFilled(false);
        removeBtn.setBorderPainted(false);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(removeBtn)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int i = 0;
        while(i < jCheckBoxs.size())
        {
            JCheckBox temp = jCheckBoxs.get(i);
            if(temp.isSelected()){
                jCheckBoxs.remove(temp);
                alarms.remove(i);
                jPanel1.remove(temp);
                
            }
            else{
                i++;
            }
        }
        /*
        for(int i=0;i<jCheckBoxs.size();i++){
            JCheckBox temp = jCheckBoxs.get(i);
            if(temp.isSelected()){
                jCheckBoxs.remove(temp);
                alarms.remove();
                jPanel1.remove(temp);
                
            }
        }
        */
        jPanel1.revalidate();
        jPanel1.repaint();
        writeInput();
    }//GEN-LAST:event_removeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditAlarmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAlarmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAlarmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAlarmDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditAlarmDialog dialog = new EditAlarmDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables

    private void displayAlarms() {
        for(Time time : alarms){
            String text = time.toString() + ", " + time.getDay();
            JCheckBox jCheckBox = new JCheckBox();
            jCheckBox.setText(text);
            Font curFont = jCheckBox.getFont();
            jCheckBox.setFont(new Font(curFont.getFamily(),curFont.getStyle(),20));
            jCheckBox.setBackground(Color.black);
            jCheckBox.setForeground(Color.black);
            jCheckBoxs.add(jCheckBox);
            jPanel1.add(jCheckBox);
            jPanel1.revalidate();
            jPanel1.repaint();
        } 
    }
    
    private void writeInput(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("input.txt");
        } catch (IOException ex) {
            Logger.getLogger(EditAlarmDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(String.valueOf(alarms.size()));
        for(Time time : alarms) {
            printWriter.print(time.toString()+ " " + time.getDay());
        }
        printWriter.close();
    }
    
    

}
