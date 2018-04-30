package graduation;

import java.io.IOException;
import javax.swing.JOptionPane;


public class games extends javax.swing.JFrame {

    public games() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 600, 600));
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/speed math.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 10, 150, 150);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/bling game.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 10, 180, 170);

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 220, 70, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/blue_squares-widescreen_wallpapers.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{      
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Program Files (x86)\\NeuroSky\\MindWave Mobile core\\SpeedMath\\SpeedMath.exe");
                            }
                    catch (IOException e){
                       JOptionPane.showMessageDialog(null,"Error");

                }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
                  try{      
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Program Files\\application.windows64\\GAME.exe");
                            }
                    catch (IOException e){
                       JOptionPane.showMessageDialog(null,"Error");

                } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
        graduation.list.jButton1.setEnabled(true);
        graduation.list.jButton2.setEnabled(true);
        graduation.list.jButton4.setEnabled(true);
        graduation.list.jButton5.setEnabled(true);
        graduation.list.jButton6.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
