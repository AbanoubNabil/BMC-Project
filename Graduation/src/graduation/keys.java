
package graduation;

import static graduation.list.clickstate;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;

public  class keys extends javax.swing.JFrame {

    Robot rr;

    public keys() {
        initComponents();
        /*
        try {
            this.rr = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(list.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // e.setVisible(false);
       // a.setVisible(false);
        
        */
    }

    public keys(String s) {
        super();
       // tab();
    }
    
/*
    public void tab() {

        while (clickstate == 0) {
            System.out.println("loza222");
            rr.keyPress(KeyEvent.VK_TAB);
            rr.keyRelease(KeyEvent.VK_TAB);
            System.out.println("loza333333");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                exit();
            }

        }

    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enkeyboard = new javax.swing.JButton();
        e = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/keyboardf.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(49, 11, 206, 169);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Keyboard_icon1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 10, 182, 169);

        enkeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enkeyboardActionPerformed(evt);
            }
        });
        enkeyboard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enkeyboardKeyPressed(evt);
            }
        });
        getContentPane().add(enkeyboard);
        enkeyboard.setBounds(370, 40, 180, 90);

        e.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        e.setForeground(new java.awt.Color(255, 255, 255));
        e.setText("English keyboard");
        getContentPane().add(e);
        e.setBounds(381, 198, 142, 48);

        a.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Arabic Keyboard");
        getContentPane().add(a);
        a.setBounds(66, 198, 145, 48);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("back");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 320, 180, 50);

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
        jButton2.setBounds(50, 50, 200, 90);
        getContentPane().add(jButton3);
        jButton3.setBounds(263, 330, 80, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/blue_squares-widescreen_wallpapers.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 620, 470);

        setSize(new java.awt.Dimension(581, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        e.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        e.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        a.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       //s a.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        dispose();

    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        this.setVisible(false);
        new keyboardframe().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        this.setVisible(false);
        new Akeyboardframe().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Akeyboardframe().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void enkeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enkeyboardActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new keyboardframe().setVisible(true);
    }//GEN-LAST:event_enkeyboardActionPerformed

    private void enkeyboardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enkeyboardKeyPressed
        // TODO add your handling code here:
            this.setVisible(false);
        new keyboardframe().setVisible(true);
    }//GEN-LAST:event_enkeyboardKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        this.setVisible(false);
        new Akeyboardframe().setVisible(true);
    }//GEN-LAST:event_jButton2KeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel e;
    public static javax.swing.JButton enkeyboard;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
