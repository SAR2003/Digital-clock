import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.GraphicsEnvironment;
import java.io.*;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener; 
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Transparency;
/**
 *
 * @author SAA
 */
import java.awt.Color;
import java.awt.event.ItemEvent;

public class MainClass extends javax.swing.JFrame implements ItemListener{

    /**
     * Creates new form MainClass
     */
    private int timeFormat;
    private Clock clock = new Clock();
    private alarmClock alarmC = new alarmClock();
    private String timeZone="IST";
    public MainClass() {
        getContentPane().setBackground(Color.black);
       // getContentPane().setBorder(new LineBorder(clock.getProperties().getBorderColor(),5));
        int i = 0;
        initComponents();
        toggleBtn.setOpaque(false);
        toggleBtn.setContentAreaFilled(false);
        toggleBtn.setBorderPainted(false);
        alarmBtn.setOpaque(true);
        //timerBtn.setOpaque(true);
        settingsBtn.setOpaque(true);
        //stopwatchBtn.setOpaque(true);
        settingsBtn.setBackground(new java.awt.Color(255, 255, 255));
        settingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingsicon.png")));
        settingsBtn.setToolTipText("");
        setAction();
        new Thread(){
            public void run(){
                while(true){
                    if(timeFormat==1)
                    {
                    timeLabel.setText(clock.getTime(timeZone).toString());
                    amLabel.setText(clock.getTime(timeZone).getAM());
                    }
                    else
                    {
                    timeLabel.setText(clock.getTime(timeZone).toggle());
                    amLabel.setText("");
                    }
                    String day=clock.getDay();
                    dateLabel.setText(day);
                    mainPanel.setBorder(new LineBorder(clock.getProperties().getBorderColor(),clock.getProperties().getBorderSize()));
                    getContentPane().setBackground(clock.getProperties().getBgColor());
                    timeLabel.setForeground(clock.getProperties().getTextColor());
                    timeLabel.setFont(clock.getProperties().getFont());
                    dateLabel.setForeground(clock.getProperties().getTextColor());
                    dateLabel.setFont(new Font(clock.getProperties().getFont().getFamily(),0,30));
                    alarmC.checkAlarm(clock.getTime(timeZone, timeFormat), day);
                }
            }
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        settingsBtn = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        BtnPanel = new javax.swing.JPanel();
        alarmBtn = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        amLabel = new javax.swing.JLabel();
        toggleBtn = new javax.swing.JToggleButton();
        timeFormatLabel = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setOpaque(false);

        settingsBtn.setBackground(new java.awt.Color(0, 0, 0));
        settingsBtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 11)); // NOI18N
        settingsBtn.setForeground(new java.awt.Color(255, 255, 153));
        settingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingsicon.png"))); // NOI18N
        settingsBtn.setToolTipText("");
        settingsBtn.setOpaque(false);
        settingsBtn.setContentAreaFilled(false);
        settingsBtn.setBorderPainted(false);
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Date here");

        BtnPanel.setOpaque(false);

        alarmBtn.setBackground(new java.awt.Color(255, 255, 255));
        alarmBtn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        alarmBtn.setForeground(new java.awt.Color(255, 255, 255));
        alarmBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/almclk.png"))); // NOI18N
        alarmBtn.setHideActionText(true);
        alarmBtn.setOpaque(false);
        alarmBtn.setContentAreaFilled(false);
        alarmBtn.setBorderPainted(false);
        alarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BtnPanelLayout = new javax.swing.GroupLayout(BtnPanel);
        BtnPanel.setLayout(BtnPanelLayout);
        BtnPanelLayout.setHorizontalGroup(
            BtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnPanelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(alarmBtn)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        BtnPanelLayout.setVerticalGroup(
            BtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnPanelLayout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(alarmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        timeLabel.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(0, 204, 204));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00:00:00");
        timeLabel.setMaximumSize(new java.awt.Dimension(212, 100));
        timeLabel.setMinimumSize(new java.awt.Dimension(212, 100));

        amLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amLabel.setForeground(new java.awt.Color(255, 255, 255));
        amLabel.setText("AM/PM");

        toggleBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        toggleBtn.setForeground(new java.awt.Color(255, 255, 255));
        toggleBtn.setText("12HR");
        toggleBtn.setOpaque(false);
        toggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtnActionPerformed(evt);
            }
        });

        timeFormatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeFormatLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeFormatLabel.setText("IST");
        timeFormatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeFormatLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(timeFormatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(amLabel)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsBtn)
                    .addComponent(toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeFormatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getAmlabel()
    {
        return amLabel;
    }
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        JDialog settingsDialog = new Settings(clock);
        settingsDialog.setVisible(true);
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void toggleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtnActionPerformed
      
    }//GEN-LAST:event_toggleBtnActionPerformed

    private void timeFormatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeFormatLabelMouseClicked
        TimeZoneDialog timeZoneDialog = new TimeZoneDialog(this, rootPaneCheckingEnabled,this);
        timeZoneDialog.setVisible(true);
    }//GEN-LAST:event_timeFormatLabelMouseClicked

    private void alarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmBtnActionPerformed
        alarmC.setVisible(true);
    }//GEN-LAST:event_alarmBtnActionPerformed

     private void setAction() {  
       toggleBtn.addItemListener(this);   
    }  
    
    public void itemStateChanged(ItemEvent eve) {  
        if (toggleBtn.isSelected())  
        {
            toggleBtn.setText("24HR");
            timeFormat=1;
        }
        else
        {   
            toggleBtn.setText("12HR");
            timeFormat=0;
        }
        
    }  

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        timeFormatLabel.setText(timeZone);
    }

    public String getTimeZone() {
        return timeZone;
    }
    
    
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
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnPanel;
    private javax.swing.JButton alarmBtn;
    private javax.swing.JLabel amLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JLabel timeFormatLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JToggleButton toggleBtn;
    // End of variables declaration//GEN-END:variables
}
