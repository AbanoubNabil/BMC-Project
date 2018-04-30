package graduation;

//import static graduation.list.clickstate;
import static graduation.list.clickstate2;
import static graduation.login.NAME;
import static graduation.login.PASSWORD;
import static graduation.register.CRPASSWORD;
import static graduation.register.RNAME;
import static graduation.register.RPASSWORD;
import static graduation.keys.enkeyboard;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import neurosky.*;
import processing.core.PApplet;
import static processing.core.PApplet.println;

public class processingSketchForList extends PApplet {

    // int clickstate2 = 0;
    Robot rr;

    @Override
    public void setup() {
//list liobg =new list();
        try {
            rr = new Robot();
        } catch (AWTException e) {
            println("Robot class not supported by your system!");
            //  exit();
            
        }
        //establish aconnection with mindwave
/*
         ThinkGearSocket neuroSocket = new ThinkGearSocket(this);
         try {
         neuroSocket.start();
         } 
         catch (ConnectException e) {
         println("Is ThinkGear running??");
         }
         */
        connect();

    }

    public void connect() {
        ThinkGearSocket neuroSocket = new ThinkGearSocket(this);
        try {
            neuroSocket.start();
        } catch (ConnectException e) {
            println("Is ThinkGear running??");

        }
        System.out.println("i'm connect from  processingsketchforlist");
    }

    public void  blinkEvent(int blinkStrength) throws IOException {

        if (blinkStrength > 50) {
            System.out.println(graduation.list.jButton6.isFocusOwner()+"test");
          //  System.out.println(graduation.login.NAME.isFocusOwner()+"test2");
            if (clickstate2 == 0) {
                println("blinkStrength: " + blinkStrength + "from if");
                clickstate2 = 1;
                if (graduation.list.jButton6.isFocusOwner()) {
                    System.exit(width);
                } else if (graduation.list.jButton5.isFocusOwner()) {
                    new login().setVisible(true);
                    //graduation.list.jButton5.setVisible(true);
                } else if (graduation.list.jButton1.isFocusOwner()) {
                    new MouseFrame().setVisible(true);
                    //graduation.list.jButton5.setVisible(true);

                } else if (graduation.list.jButton2.isFocusOwner()) {
                    new keys().setVisible(true);
                    //graduation.list.jButton5.setVisible(true);
                } else if (graduation.list.jButton3.isFocusOwner()) {
                    new games().setVisible(true);
                    //graduation.list.jButton5.setVisible(true);
                } else if (graduation.list.jButton4.isFocusOwner()) {


                } else if (graduation.login.NAME.isFocusOwner() || graduation.login.PASSWORD.isFocusOwner()) {
                    new keys().setVisible(true);
                } else if (graduation.login.jButton1.isFocusOwner()) {
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
                               // MyProcessingSketch mlog = new MyProcessingSketch();
                               // mlog.connect();
                                dispose();
                                found = true;
                                return  ;
                            }

                        }
                        if (found == false) {
                            JOptionPane.showMessageDialog(null, "Username OR Password not in database!");
                        }
                        ufr.close();
                        pfr.close();
                    } catch (Exception ex) {
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (graduation.login.jButton2.isFocusOwner()) {
                    new register().setVisible(true);
                    dispose();
                } /*else if (graduation.mainpage.jButton1.isFocusOwner()) {
                    new keys().setVisible(true);
                } /*else if (graduation.keys.enkeyboard.isFocusOwner()) {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Program Files (x86)\\NeuroSky\\MindWave Mobile core\\SpeedMath\\hjhjhjhjh.exe");
                      
                } else if (graduation.keys.jButton2.isFocusOwner()) { 
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Program Files (x86)\\NeuroSky\\MindWave Mobile core\\SpeedMath\\hjhjhjhjh.exe");
                      
                }*//* else if (graduation.keys.jButton3.isFocusOwner()) {
                    dispose();
                } else if (graduation.mainpage.jButton2.isFocusOwner()) {
                    new MouseFrame().setVisible(true);
                } else if (graduation.register.jButton1.isFocusOwner()) {
                    String namee = RNAME.getText();
                    String pw = RPASSWORD.getText();
                    String cpwd = CRPASSWORD.getText();
                    if (!(pw.equals("") && namee.equals("") && cpwd.equals(""))) {
                        if (pw.equals(cpwd)) {
                            try {
                                try (PrintWriter outn = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bombo\\Graduation\\src\\graduation\\users.txt", true)))) {
                                    outn.println("\n" + namee);
                                }
                                try (PrintWriter outp = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bombo\\Graduation\\src\\graduation\\password.txt", true)))) {
                                    outp.println("\n" + pw);
                                }

                                JOptionPane.showMessageDialog(null, "you are added to our database!");
                                dispose();
                            } catch (IOException e) {
                                //exception handling left as an exercise for the reader

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "password is not the same!");
                            dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "please complete the data!");
                        dispose();
                    }

                } else if (graduation.register.jButton2.isFocusOwner()) {
                    new login().setVisible(true);
                    dispose();
                } else if (graduation.register.RNAME.isFocusOwner() || graduation.register.RPASSWORD.isFocusOwner() || graduation.register.CRPASSWORD.isFocusOwner()) {
                    new keys().setVisible(true);
                    dispose();
                }

                //System.exit(WIDTH);
                        */
            }
            println("blinkStrength: " + blinkStrength + "out side if");
            clickstate2 = 0;
            graduation.Abrainkeyboard.blinkSt2 = blinkStrength;
            graduation.brainkeyboard.blinkSt = blinkStrength;
        }
       
    }

    @Override
    public void draw() {

        background(0);
        size(340, 240);
        background(0);

    }

}
