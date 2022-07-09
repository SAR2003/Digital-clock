import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JColorChooser;
import javax.swing.border.LineBorder;
@SuppressWarnings("serial")
public class Settings extends javax.swing.JDialog {
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;
    //the font
    private Clock clock = new Clock();
    private Font font;
    private Properties defaultProperties = new Properties();
    private int borderSize;
    //Constructors
    /** Creates new form JFontChooser */
    public Settings(java.awt.Frame parent, Font font) {
        super(parent);
        this.font = font;
        initComponents();
       // lblPreview.setFont(font);
    }
    
    public Settings(java.awt.Frame parent) {
        super(parent);
        this.font = new Font("Dialog",Font.PLAIN,12);
        initComponents();
       // lblPreview.setFont(font);
    }
    
    public Settings(Clock clock) {
        super((javax.swing.JFrame)null);
        this.clock = clock;
        font =  clock.getProperties().getFont();
        borderSize = clock.getProperties().getBorderSize();
        initComponents();
        //lblPreview.setFont(font);
    }
    
    public Settings() {
        super((javax.swing.JFrame)null);
        initComponents();
    //    lblPreview.setFont(font);
    }
    
    /** @return the font chosen by the user */
    public Font getFont(){
        return font;
    }
    
    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        previewText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        okbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bgColorBtn = new javax.swing.JButton();
        borderColorBtn = new javax.swing.JButton();
        textColorBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        fontList = new javax.swing.JList<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        jScrollPane2 = new javax.swing.JScrollPane();
        styleList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        sizeList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        borderSizeList = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        styleLabel = new javax.swing.JTextField();
        fontLabel = new javax.swing.JTextField();
        sizeLabel = new javax.swing.JTextField();
        borderSizeLabel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        preview = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        previewText.setBackground(new java.awt.Color(204, 51, 0));
        previewText.setText("Hello World");
        //previewText.setForeground(clock.getProperties().getTextColor());
        //previewText.setBackground(new java.awt.Color(0, 0, 0));
        //previewText.setFont(clock.getProperties().getFont());
        //previewText.setBorder(new LineBorder(clock.getProperties().getBorderColor(),3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        okbtn.setText("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset to Default");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Text Color");

        bgColorBtn.setBackground(clock.getProperties().getBgColor());
        bgColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgColorBtnActionPerformed(evt);
            }
        });

        borderColorBtn.setBackground(clock.getProperties().getBorderColor());
        borderColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderColorBtnActionPerformed(evt);
            }
        });

        textColorBtn.setBackground(clock.getProperties().getTextColor());
        textColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColorBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Background");

        jLabel3.setText("Border Color");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bgColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borderColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bgColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borderColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fontList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fontList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fontListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(fontList);

        styleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Plain", "Bold", "Italic", "Bold Italic" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        styleList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        styleList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                styleListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(styleList);

        sizeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "10", "11", "12", "14", "16", "20", "24", "28", "36", "48", "72", "96" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sizeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sizeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                sizeListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(sizeList);

        borderSizeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        borderSizeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        borderSizeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                borderSizeListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(borderSizeList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel1.setText("Font Name");

        jLabel6.setText("Font Style");

        jLabel7.setText("Size");

        styleLabel.setText(clock.getProperties().getStyleName());
        styleLabel.setEditable(false);
        styleLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleLabelActionPerformed(evt);
            }
        });

        fontLabel.setText(clock.getProperties().getFont().getFamily());
        fontLabel.setEditable(false);
        fontLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontLabelActionPerformed(evt);
            }
        });

        sizeLabel.setText(String.valueOf(clock.getProperties().getFont().getSize()));
        sizeLabel.setEditable(false);
        sizeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeLabelActionPerformed(evt);
            }
        });

        borderSizeLabel.setText(String.valueOf(clock.getProperties().getBorderSize()));
        borderSizeLabel.setEditable(false);
        borderSizeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderSizeLabelActionPerformed(evt);
            }
        });

        jLabel9.setText("Border Size");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fontLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(styleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(borderSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(styleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borderSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Preview");

        preview.setEditable(false);
        preview.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        preview.setText("00:00:00");
        preview.setForeground(clock.getProperties().getTextColor());
        preview.setBackground(new java.awt.Color(0, 0, 0));
        preview.setFont(clock.getProperties().getFont());
        preview.setBorder(new LineBorder(clock.getProperties().getBorderColor(),3));
        preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 46, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelbtn)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbtn)
                    .addComponent(cancelbtn)
                    .addComponent(resetBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstStyleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStyleValueChanged
        int style = -1;
//        String selStyle = (String)lstStyle.getSelectedValue();
//        if(selStyle=="Plain")
//            style = Font.PLAIN;
//        if(selStyle=="Bold")
//            style = Font.BOLD;
//        if(selStyle=="Italic")
//            style = Font.ITALIC;
//        if(selStyle=="Bold Italic")
//            style = Font.BOLD + Font.ITALIC;
        
      //  font = new Font(font.getFamily(),style,font.getSize());
       // lblPreview.setFont(font);
    }//GEN-LAST:event_lstStyleValueChanged

    private void lstSizeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstSizeValueChanged
//        int size = Integer.parseInt((String)lstSize.getSelectedValue());
//        font = new Font(font.getFamily(),font.getStyle(),size);
//        lblPreview.setFont(font);
    }//GEN-LAST:event_lstSizeValueChanged

    private void lstFontValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFontValueChanged
//        font = new Font((String)lstFont.getSelectedValue(),font.getStyle(),font.getSize());
//        lblPreview.setFont(font);
    }//GEN-LAST:event_lstFontValueChanged
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void borderColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderColorBtnActionPerformed
        Color initialBorderColor = borderColorBtn.getBackground();
        Color borderColor = JColorChooser.showDialog(null,
            "JColorChooser Sample",initialBorderColor);
        if (borderColor != null) {
          borderColorBtn.setBackground(borderColor);
          preview.setBorder(new LineBorder(borderColor,borderSize));
        }
    }//GEN-LAST:event_borderColorBtnActionPerformed

    private void bgColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgColorBtnActionPerformed
        Color initialBgColor = bgColorBtn.getBackground();
        Color bgColor = JColorChooser.showDialog(null,
            "JColorChooser Sample",initialBgColor);
        if (bgColor != null) {
          bgColorBtn.setBackground(bgColor);
          preview.setBackground(bgColor);
        }
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    }//GEN-LAST:event_bgColorBtnActionPerformed

    private void textColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColorBtnActionPerformed
        Color initialTextColor = textColorBtn.getBackground();
        Color textColor = JColorChooser.showDialog(null,
            "JColorChooser Sample",initialTextColor);
        if (textColor != null) {
          textColorBtn.setBackground(textColor);
          preview.setForeground(textColor);
        }
    }//GEN-LAST:event_textColorBtnActionPerformed

    private void fontLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fontLabelActionPerformed

    private void styleLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_styleLabelActionPerformed

    private void fontListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fontListValueChanged
        font = new Font((String)fontList.getSelectedValue(),font.getStyle(),font.getSize());
        fontLabel.setText(fontList.getSelectedValue());
        preview.setFont(font);
    }//GEN-LAST:event_fontListValueChanged

    private void styleListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_styleListValueChanged
        int style = -1;
        String selStyle = (String)styleList.getSelectedValue();
        if(selStyle=="Plain")
            style = Font.PLAIN;
        if(selStyle=="Bold")
            style = Font.BOLD;
        if(selStyle=="Italic")
            style = Font.ITALIC;
        if(selStyle=="Bold Italic")
            style = Font.BOLD + Font.ITALIC;
        
        font = new Font(font.getFamily(),style,font.getSize());
        styleLabel.setText(selStyle);
        preview.setFont(font);
    }//GEN-LAST:event_styleListValueChanged

    private void sizeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sizeListValueChanged
        int size = Integer.parseInt((String)sizeList.getSelectedValue());
        font = new Font(font.getFamily(),font.getStyle(),size);
        sizeLabel.setText(String.valueOf(size));
        preview.setFont(font);
    }//GEN-LAST:event_sizeListValueChanged

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        clock.getProperties().setFont(font);
        clock.getProperties().setBgColor(bgColorBtn.getBackground());
        clock.getProperties().setBorderColor(borderColorBtn.getBackground());
        clock.getProperties().setTextColor(textColorBtn.getBackground());
        clock.getProperties().setBorderSize(borderSize);
        dispose();
    }//GEN-LAST:event_okbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previewActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        preview.setForeground(defaultProperties.getTextColor());
        preview.setBackground(defaultProperties.getBgColor());
        preview.setFont(defaultProperties.getFont());
        preview.setBorder(new LineBorder(defaultProperties.getBorderColor(),defaultProperties.getBorderSize()));
        bgColorBtn.setBackground(defaultProperties.getBgColor());
        borderColorBtn.setBackground(defaultProperties.getBorderColor());
        textColorBtn.setBackground(defaultProperties.getTextColor());
        fontLabel.setText(defaultProperties.getFont().getFamily());
        styleLabel.setText(defaultProperties.getStyleName());
        sizeLabel.setText(String.valueOf(defaultProperties.getFont().getSize()));
        borderSizeLabel.setText(String.valueOf(defaultProperties.getBorderSize()));
        font  = defaultProperties.getFont();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void sizeLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeLabelActionPerformed

    private void borderSizeLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderSizeLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borderSizeLabelActionPerformed

    private void borderSizeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_borderSizeListValueChanged
        int size = Integer.parseInt((String)borderSizeList.getSelectedValue());
        borderSizeLabel.setText(String.valueOf(size));
        preview.setBorder(new LineBorder(borderColorBtn.getBackground(),size));
        borderSize = size;
    }//GEN-LAST:event_borderSizeListValueChanged
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     *  main used for testing purposes only
     */
   public static void main(String args[]) {
        new Settings().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bgColorBtn;
    private javax.swing.JButton borderColorBtn;
    private javax.swing.JTextField borderSizeLabel;
    private javax.swing.JList<String> borderSizeList;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField fontLabel;
    private javax.swing.JList<String> fontList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton okbtn;
    private javax.swing.JTextField preview;
    private javax.swing.JLabel previewText;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField sizeLabel;
    private javax.swing.JList<String> sizeList;
    private javax.swing.JTextField styleLabel;
    private javax.swing.JList<String> styleList;
    private javax.swing.JButton textColorBtn;
    // End of variables declaration//GEN-END:variables
    
    private int returnStatus = RET_CANCEL;
}