

package graduation;


import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public  class login extends javax.swing.JFrame {

     Robot rr;
    public login() {
        
        initComponents();
        
        try {
                this.rr = new Robot();
            } catch (AWTException ex) {
                Logger.getLogger(list.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
     public login(String s) {
         super();
        // mangaa();
     }
     /*
  public  void tab2(){
      
 while (clickstate==0){
      System.out.println("test2");
   rr.keyPress(KeyEvent.VK_TAB);
   rr.keyRelease(KeyEvent.VK_TAB);
    System.out.println("test3");
 try
 {
 Thread.sleep(4000);
 }
 catch (Exception e)
 {
 exit();
 }
   
    }
       
      
    }
  */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 60, 70, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 70, 30);
        getContentPane().add(NAME);
        NAME.setBounds(150, 60, 198, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 210, 98, 41);

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 210, 98, 41);

        jLabel3.setFont(new java.awt.Font("Vladimir Script", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 440, 53);
        getContentPane().add(PASSWORD);
        PASSWORD.setBounds(150, 130, 198, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/4097561067_cc2a4984bf_o.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 490, 310);

        setSize(new java.awt.Dimension(435, 298));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new register().setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        FileReader ufr;
        FileReader pfr;
        try {
            ufr = new FileReader("C:\\Users\\bombo\\Desktop\\Graduation\\src\\graduation\\users.txt");
            pfr = new FileReader("C:\\Users\\bombo\\Desktop\\Graduation\\src\\graduation\\passwords.txt");
            BufferedReader ubr = new BufferedReader(ufr);
            BufferedReader pbr = new BufferedReader(pfr);
            String user;
            String password;
            boolean found = false;
            String name = NAME.getText();
            String pwd = PASSWORD.getText();
            while (((user = ubr.readLine()) != null) && (password = pbr.readLine()) != null) {
                if ((name.equals(user)) && (pwd.equals(password))) {
                    new mainpage().setVisible(true);
                     list.jButton2.setEnabled(true);
             list.jButton3.setEnabled(true);
              list.jButton4.setEnabled(true);
               list.jButton5.setEnabled(true);
                list.jButton1.setEnabled(true);
                    //jPopupMenu1.setVisible(true);
                    MyProcessingSketch mlog = new MyProcessingSketch();
                    mlog.connect();
                    dispose();
                    found = true;
                    return;
                }

            }
            if (found == false) {
                JOptionPane.showMessageDialog(null, "Username OR Password not in database!");
            }
            ufr.close();
            pfr.close();
        } catch (HeadlessException | IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
    }//GEN-LAST:event_jButton1ActionPerformed

 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField NAME;
    public static javax.swing.JPasswordField PASSWORD;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
