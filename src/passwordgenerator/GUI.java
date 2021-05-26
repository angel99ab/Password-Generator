/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import javax.swing.JLabel;

/**
 *
 * @author angel
 */
public class GUI extends javax.swing.JFrame {

    private Password p;
    private String pass;

    /**
     * Creates new form GUI
     */
    public GUI() {
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
        btnGeneratePassword = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnClipToBoard = new javax.swing.JButton();
        lblNewPassword = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPL = new javax.swing.JLabel();
        sLength = new javax.swing.JSlider();
        lblLength = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cbUpper = new javax.swing.JCheckBox();
        lblUppercase = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblLowercase = new javax.swing.JLabel();
        cbLower = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        lblNumbers = new javax.swing.JLabel();
        cbNumbers = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        lblSymbols = new javax.swing.JLabel();
        cbSymbols = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        lblStrength = new javax.swing.JLabel();
        cmbLanguages = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password generator");
        setMinimumSize(new java.awt.Dimension(520, 550));
        setPreferredSize(new java.awt.Dimension(595, 550));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGeneratePassword.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnGeneratePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneratePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/generate_password.png"))); // NOI18N
        btnGeneratePassword.setBorderPainted(false);
        btnGeneratePassword.setContentAreaFilled(false);
        btnGeneratePassword.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/generate_password2.png"))); // NOI18N
        btnGeneratePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeneratePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 445, 350, 50));

        jPanel3.setBackground(new java.awt.Color(80, 80, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClipToBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/clipboard.png"))); // NOI18N
        btnClipToBoard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClipToBoard.setBorderPainted(false);
        btnClipToBoard.setContentAreaFilled(false);
        btnClipToBoard.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/clipboard-checked.png"))); // NOI18N
        btnClipToBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClipToBoardActionPerformed(evt);
            }
        });
        jPanel3.add(btnClipToBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 40, 40));

        lblNewPassword.setBackground(new java.awt.Color(80, 80, 80));
        lblNewPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 530, 60));

        jPanel4.setBackground(new java.awt.Color(80, 80, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPL.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPL.setForeground(new java.awt.Color(255, 255, 255));
        lblPL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPL.setText("Password Length");
        jPanel4.add(lblPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 200, 40));

        sLength.setMajorTickSpacing(10);
        sLength.setMaximum(40);
        sLength.setMinorTickSpacing(1);
        sLength.setValue(10);
        sLength.setOpaque(false);
        sLength.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sLengthStateChanged(evt);
            }
        });
        jPanel4.add(sLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 26, 280, 20));

        lblLength.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLength.setForeground(new java.awt.Color(255, 255, 255));
        lblLength.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLength.setText("10");
        jPanel4.add(lblLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 530, 60));

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbUpper.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbUpper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbUpper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/black-switch.png"))); // NOI18N
        cbUpper.setMaximumSize(new java.awt.Dimension(64, 64));
        cbUpper.setMinimumSize(new java.awt.Dimension(64, 64));
        cbUpper.setOpaque(false);
        cbUpper.setPreferredSize(new java.awt.Dimension(64, 64));
        cbUpper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbUpperMouseClicked(evt);
            }
        });
        jPanel5.add(cbUpper, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 75, 40));

        lblUppercase.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUppercase.setForeground(new java.awt.Color(255, 255, 255));
        lblUppercase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUppercase.setText("Uppercase");
        jPanel5.add(lblUppercase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 60));

        jPanel6.setBackground(new java.awt.Color(80, 80, 80));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLowercase.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblLowercase.setForeground(new java.awt.Color(255, 255, 255));
        lblLowercase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLowercase.setText("Lowercase");
        lblLowercase.setPreferredSize(new java.awt.Dimension(72, 22));
        jPanel6.add(lblLowercase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 40));

        cbLower.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbLower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbLower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/black-switch.png"))); // NOI18N
        cbLower.setOpaque(false);
        cbLower.setPreferredSize(new java.awt.Dimension(64, 64));
        cbLower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbLowerMouseClicked(evt);
            }
        });
        jPanel6.add(cbLower, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 75, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 260, 60));

        jPanel7.setBackground(new java.awt.Color(80, 80, 80));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumbers.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblNumbers.setForeground(new java.awt.Color(255, 255, 255));
        lblNumbers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumbers.setText("Numbers");
        jPanel7.add(lblNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 40));

        cbNumbers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbNumbers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbNumbers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/black-switch.png"))); // NOI18N
        cbNumbers.setMaximumSize(new java.awt.Dimension(64, 64));
        cbNumbers.setMinimumSize(new java.awt.Dimension(64, 64));
        cbNumbers.setOpaque(false);
        cbNumbers.setPreferredSize(new java.awt.Dimension(64, 64));
        cbNumbers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbNumbersMouseClicked(evt);
            }
        });
        jPanel7.add(cbNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 75, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 60));

        jPanel8.setBackground(new java.awt.Color(80, 80, 80));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSymbols.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSymbols.setForeground(new java.awt.Color(255, 255, 255));
        lblSymbols.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSymbols.setText("Symbols");
        lblSymbols.setToolTipText("");
        lblSymbols.setAlignmentX(0.5F);
        jPanel8.add(lblSymbols, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 40));

        cbSymbols.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSymbols.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbSymbols.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordgenerator/img/black-switch.png"))); // NOI18N
        cbSymbols.setMaximumSize(new java.awt.Dimension(64, 64));
        cbSymbols.setMinimumSize(new java.awt.Dimension(64, 64));
        cbSymbols.setOpaque(false);
        cbSymbols.setPreferredSize(new java.awt.Dimension(64, 64));
        cbSymbols.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbSymbolsMouseClicked(evt);
            }
        });
        jPanel8.add(cbSymbols, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 75, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 260, 60));

        jPanel9.setBackground(new java.awt.Color(80, 80, 80));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStrength.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblStrength.setForeground(new java.awt.Color(255, 255, 255));
        lblStrength.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStrength.setText("Normal");
        lblStrength.setToolTipText("");
        lblStrength.setAlignmentX(0.5F);
        jPanel9.add(lblStrength, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 490, 40));
        lblStrength.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 530, 60));

        cmbLanguages.setBackground(new java.awt.Color(51, 51, 51));
        cmbLanguages.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbLanguages.setForeground(new java.awt.Color(255, 255, 255));
        cmbLanguages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Español", "Galego" }));
        cmbLanguages.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbLanguages.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLanguagesItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbLanguages, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 110, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneratePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePasswordActionPerformed
        p = new Password(cbLower.isSelected(), cbUpper.isSelected(), cbNumbers.isSelected(), cbSymbols.isSelected(), sLength.getValue());
        pass = p.getPassword();
        lblNewPassword.setText(pass);
    }//GEN-LAST:event_btnGeneratePasswordActionPerformed

    private void cbUpperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbUpperMouseClicked
        setCheckboxImage(cbUpper);
    }//GEN-LAST:event_cbUpperMouseClicked

    private void cbLowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbLowerMouseClicked
        setCheckboxImage(cbLower);
    }//GEN-LAST:event_cbLowerMouseClicked

    private void cbNumbersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbNumbersMouseClicked
        setCheckboxImage(cbNumbers);
    }//GEN-LAST:event_cbNumbersMouseClicked

    private void cbSymbolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSymbolsMouseClicked
        setCheckboxImage(cbSymbols);
    }//GEN-LAST:event_cbSymbolsMouseClicked

    private void btnClipToBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClipToBoardActionPerformed
        String myString = pass;
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnClipToBoardActionPerformed

    private void cmbLanguagesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLanguagesItemStateChanged
        if(evt.getStateChange() == evt.SELECTED ) {
            setLanguage(cmbLanguages.getSelectedIndex());
        }
    }//GEN-LAST:event_cmbLanguagesItemStateChanged

    private void sLengthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sLengthStateChanged
        lblLength.setText(String.valueOf(sLength.getValue()));
        passwordStrength(sLength.getValue(), cmbLanguages.getSelectedIndex());
    }//GEN-LAST:event_sLengthStateChanged

    private void passwordStrength(int value, int language) {
        String[][] languages = {{"Very weak", "Weak", "Normal", "Strong", "Very Strong"},
                                {"Muy débil", "Débil", "Normal", "Fuerte", "Muy fuerte"},
                                {"Moi débil", "Débil", "Normal", "Forte", "Moi forte"}};
       
        if(value <= 4) {
            lblStrength.setText(languages[language][0]);
        }
        if(value > 4) {
            lblStrength.setText(languages[language][1]);
        }
        if(value > 8) {
            lblStrength.setText(languages[language][2]);
        }
        if(value > 12) {
            lblStrength.setText(languages[language][3]);
        }
        if(value >= 20) {
            lblStrength.setText(languages[language][4]);
        }

    }
    
    private void setLanguage(int language) {
        JLabel[] labels = {lblPL, lblUppercase, lblLowercase, lblNumbers, lblSymbols};
        
        String[][] languages = {{"Password Length", "Uppercase", "Lowercase", "Numbers", "Symbols"},
                                {"Long contraseña", "Mayúsculas", "Minúsculas", "Números", "Símbolos"},
                                {"Lonx contrasinal", "Maiúsculas", "Minúsculas", "Números", "Símbolos"}};
        
        String[][] languageButtons = {{"generate_password.png", "generate_password2.png"},
                                      {"generate-passwordE.png", "generate-passwordE2.png"},
                                      {"generate-passwordG.png", "generate-passwordG2.png"}};
        
        for (int i = 0; i < labels.length; i++) {
            labels[i].setText(languages[language][i]);
        }
        
        btnGeneratePassword.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\passwordgenerator\\img\\" + languageButtons[language][0]));
        btnGeneratePassword.setPressedIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\passwordgenerator\\img\\" + languageButtons[language][1]));
    }
    
    private void setCheckboxImage(JCheckBox c) {
        if (c.isSelected()) {
            c.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\passwordgenerator\\img\\blue-switch.png"));
        } else {
            c.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\passwordgenerator\\img\\black-switch.png"));
        }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClipToBoard;
    private javax.swing.JButton btnGeneratePassword;
    private javax.swing.JCheckBox cbLower;
    private javax.swing.JCheckBox cbNumbers;
    private javax.swing.JCheckBox cbSymbols;
    private javax.swing.JCheckBox cbUpper;
    private javax.swing.JComboBox<String> cmbLanguages;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblLowercase;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblNumbers;
    private javax.swing.JLabel lblPL;
    private javax.swing.JLabel lblStrength;
    private javax.swing.JLabel lblSymbols;
    private javax.swing.JLabel lblUppercase;
    private javax.swing.JSlider sLength;
    // End of variables declaration//GEN-END:variables
}
