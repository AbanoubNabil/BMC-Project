                                    
package graduation;

import com.sun.speech.freetts.FreeTTS;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.net.ConnectException;
import neurosky.ThinkGearSocket;
import processing.core.*;
import static processing.core.PApplet.println;

public class Abrainkeyboard extends PApplet{
    
    ThinkGearSocket neuroSocket;

    int attention2 = 0;
    public static int blinkSt2 = 0;
    int blink2 = 0;
    int k2 = 0;
    /*------------------------------------*/
    String[] letter2 = {"أ", "ب", "ت", "ث", "ج", "ح", "خ", "د", "ذ", "ر", "sp", "sp", "ز", "س", " ", " ", "ش", "ص", "ض", "ط", "ظ", "ع", "cl", "cl", "غ", "ف", "ق", "ك", "ل", "م", "ن", "ه","و", "ى","-","-"};
    /*------------------------------------*/
    String input2 = " ";
    static String lockinput2 = " ";
    int t = 0;
    PFont font;
    PImage bg;
    int i = 30, j = 110;
    /*------------------------------------*/
    
    @Override
    public void setup() {
        size(630, 320);
        /*
        ThinkGearSocket neuro_Socket;
        neuro_Socket = new ThinkGearSocket(this);
        
        try {
            neuro_Socket.start();
        } catch (ConnectException e) {
        }
        */
        fill(0);
        font = createFont("Courier", 48);
        textFont(font);
        bg = loadImage("C:\\Users\\bombo\\Desktop\\Graduation\\src\\data\\2.png");
        /*------------------------------------*/
        // open file on screen 
/*
        try {
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
                
            }
            desktop.open(new File("C:\\Users\\bombo\\testprocessing\\src\\testprocessing\\newpackage\\use.txt"));

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
*/
    }
    /*------------------------------------*/

    /**
     *
     */
    @Override
    public void draw() {
        background(120);    
        fill(255, 255, 0);
        textSize(12);
        text("Attention: " + attention2, 100, 10);
        strokeJoin(ROUND);
        stroke(50, 100, 150);
        strokeWeight(3);
        fill(255);
        rect(30, 30, 500, 50);
        //lockinput2= "abanoub nabil";
        /*----------------------------------------*/
        if (blinkSt2 > 0) {
            switch (letter2[k2]) {
                case "-":
                    input2 = input2.substring(0, input2.length() - 1);
                    break;
                case "sp":
                    Voice voice2;
                    FreeTTS freetts;
                    voice2 = VoiceManager.getInstance().getVoice("kevin16");
                    if (voice2 != null) {
                        voice2.allocate();
                    }           freetts = new FreeTTS(voice2);
        voice2.speak(lockinput2);
                    freetts.startup();
                    //freetts.urlToSpeech("http://10.0.0.109:8080/");
                    freetts.setAudioFile("c:/test.wav");
                    freetts.shutdown();
                    break;
                case "cl":
                    dispose();
                    break;
                case "AR":
                    new Akeyboardframe().setVisible(true);
                    dispose();
                    break;
                default:
                    input2 = input2 + letter2[k2];
                    lockinput2 = input2;
                    fill(0);
                    textSize(18);
                    text(input2, 40, 48, 195, 30);
                    textSize(48);
                    break;
            }
        }
        /*              
                try {
                    PrintWriter outp = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bombo\\testprocessing\\src\\testprocessing\\newpackage\\use.txt", true)));
                    outp.println(input);
                    outp.close();

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                */
        /*-----------------------------------------------------*/

        fill(255, 255, 0);
        textSize(12);
        text("Blink: " + blinkSt2, 10, 10);

        blinkSt2 = 0;
        fill(0);
        textSize(18);
        text(lockinput2, 40, 48, 500, 30);
        textSize(48);
        /*------------------------------------------------------*/
        image(bg, 30, 110);
        noFill();
        stroke(255);
        rect(i, j, 50, 50);
        print("i:" + i + " " + "j:" + j + " " + "k:" + k2 + "  " + "Blinkst:" + blinkSt2);
        /*---------------------------------------------*/
        if (attention2 > 60) {
            t = 50;
            println("  Attention: " + attention2);
             attention2=0;
        }

        if (t == 50) {

            if (i < 550) {
                i = i + 50;
            } else {
                i = 30;
                if (j < 200) {
                    j = j + 50;
                } else {
                    j = 110;
                }
            }
            /*-------------------------------------*/

            if (k2 < 35) {
                k2 = k2 + 1;
            } else {
                k2 = 0;
            }
            t = 0;

        }

        t++;
        //noLoop();
    }
    /*------------------------------------*/

    private void blinkEvent(int blinkStrength) {
        blinkSt2 = blinkStrength;
       //     blink2 = 1;    
    }
    /*------------------------------------*/

    public void attentionEvent(int attentionLevel) {
        attention2 = attentionLevel;
    }
    /*------------------------------------*/

    @Override
    public void stop() {
        neuroSocket.stop();
        super.stop();
    }

    
}
