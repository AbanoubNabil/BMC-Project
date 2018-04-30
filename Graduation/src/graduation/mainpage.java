/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graduation;

import java.io.IOException;
import javax.swing.JOptionPane;

public class mainpage extends javax.swing.JFrame {

    public mainpage() {
        initComponents();
         hint1.setVisible(false); 
          hint2.setVisible(false); 
          h1.setVisible(false);
          h2.setVisible(false);
          h3.setVisible(false);
          h4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mouse = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        keyboard = new javax.swing.JLabel();
        hint1 = new javax.swing.JLabel();
        hint2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        getContentPane().setLayout(null);

        mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/mouse copy.png"))); // NOI18N
        mouse.setToolTipText("Mouse");
        mouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mouse.setName("Mouse"); // NOI18N
        mouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mouseMousePressed(evt);
            }
        });
        getContentPane().add(mouse);
        mouse.setBounds(0, 290, 460, 270);

        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 350, 170, 160);

        keyboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/keyboardf.png"))); // NOI18N
        keyboard.setToolTipText("Keyboard");
        keyboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keyboard.setName("Keyboard"); // NOI18N
        keyboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                keyboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                keyboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                keyboardMousePressed(evt);
            }
        });
        getContentPane().add(keyboard);
        keyboard.setBounds(10, 10, 420, 260);

        hint1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        hint1.setForeground(new java.awt.Color(255, 255, 255));
        hint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hint1.setText("Using the Keyboard");
        getContentPane().add(hint1);
        hint1.setBounds(100, 60, 190, 30);

        hint2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        hint2.setForeground(new java.awt.Color(255, 255, 255));
        hint2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hint2.setText("Using the Mouse");
        getContentPane().add(hint2);
        hint2.setBounds(90, 560, 180, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Facebook-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1030, 550, 32, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/twitter-icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(980, 550, 32, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/YouTube-icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(880, 550, 32, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Instagram-icon.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(930, 550, 32, 40);

        h2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        h2.setForeground(new java.awt.Color(255, 255, 255));
        h2.setText("follow us on twitter");
        getContentPane().add(h2);
        h2.setBounds(890, 520, 160, 23);

        h3.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        h3.setForeground(new java.awt.Color(255, 255, 255));
        h3.setText("like in instagram");
        getContentPane().add(h3);
        h3.setBounds(870, 513, 140, 30);

        h1.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        h1.setForeground(new java.awt.Color(255, 255, 255));
        h1.setText("Like us on facebook");
        getContentPane().add(h1);
        h1.setBounds(920, 523, 160, 20);

        h4.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        h4.setForeground(new java.awt.Color(255, 255, 255));
        h4.setText("watch us on youtube");
        getContentPane().add(h4);
        h4.setBounds(780, 520, 160, 23);

        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 100, 170, 80);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/BrainWaves.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-110, -20, 1220, 660);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        jMenu1.setText("Login");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Login");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Register");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Tutorial");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        jMenuItem5.setText("Go To Website");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Games");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });

        jMenuItem6.setText("Speed Math");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseClicked(evt);
            }
        });
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);
        jMenu4.add(jSeparator3);

        jMenuItem7.setText("blinking game");
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1070, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           new login().setVisible(true);        // open login form
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            // TODO add your handling code here
        try{      
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Program Files (x86)\\NeuroSky\\MindWave Mobile core\\SpeedMath\\SpeedMath.exe");
                            }
                    catch (IOException e){
                       JOptionPane.showMessageDialog(null,"Error");

                }         
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          new register().setVisible(true);        // open register form
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void keyboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyboardMouseEntered
    hint1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_keyboardMouseEntered

    private void keyboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyboardMouseExited
    hint1.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_keyboardMouseExited

    private void mouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMouseEntered
    hint2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mouseMouseEntered

    private void mouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMouseExited
    hint2.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mouseMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
    h1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       h1.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    h2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
    h2.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
    h3.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
    h3.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
    h4.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
    h4.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void mouseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMousePressed
       // this.setVisible(false);
        new MouseFrame().setVisible(true);
    }//GEN-LAST:event_mouseMousePressed

    private void keyboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyboardMousePressed
//       this.setVisible(false);
       new keys().setVisible(true);
    }//GEN-LAST:event_keyboardMousePressed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
        login n=new login();
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
        register r=new register();
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        String s;
        s="not implementet yet";
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
          
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseClicked
            // TODO add your handling code here:
            try{      
                           Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Program Files (x86)\\NeuroSky\\MindWave Mobile core\\SpeedMath\\SpeedMath.exe");
                               }
                       catch (IOException e){
                                JOptionPane.showMessageDialog(null,"Error");

                   }     
    }//GEN-LAST:event_jMenuItem6MouseClicked

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        new MouseFrame().setVisible(true);
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        new keys().setVisible(true);
    }//GEN-LAST:event_jButton1KeyPressed
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel hint1;
    private javax.swing.JLabel hint2;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    public static javax.swing.JMenu jMenu3;
    public static javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    public static javax.swing.JLabel keyboard;
    public static javax.swing.JLabel mouse;
    // End of variables declaration//GEN-END:variables
}
