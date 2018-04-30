package graduation;

import com.sun.speech.freetts.FreeTTS;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import static graduation.Abrainkeyboard.lockinput2;

import java.net.*;

import neurosky.*;
import processing.core.*;

public class brainkeyboard extends PApplet {

    ThinkGearSocket neuroSocket;

    int attention = 0;
    public static int blinkSt = 0;
    int blink = 0;
    int k = 0;
    /*------------------------------------*/
    String[] letter = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "sp", "sp", "K", "L", " ", " ", "M", "N", "O", "P", "Q", "R", "cl", "cl", "S", "T", "U", "V", "W", "X", "Y", "Z", "-", "-", "AR", "AR"};
    /*------------------------------------*/
    String input = " ";
    static String lockinput = " ";
    int t = 0;
    PFont font;
    PImage bg;
    int i = 30, j = 110;
    /*------------------------------------*/
    
    @Override
    public void setup() {
        size(630, 330);
        /*
        ThinkGearSocket neuroSocket = new ThinkGearSocket(this);
        
        try {
            neuroSocket.start();
        } catch (ConnectException e) {
            e.printStackTrace();
            
        }
        */
        fill(0);
        font = createFont("Courier", 48);
        textFont(font);
        bg = loadImage("C:\\Users\\bombo\\Desktop\\Graduation\\src\\data\\1.png");
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

    @Override
    public void draw() {
        background(120);
        fill(255, 255, 0);
        textSize(12);
        text("Attention: " + attention, 100, 10);
        strokeJoin(ROUND);
        stroke(50, 100, 150);
        strokeWeight(3);
        fill(255);
        rect(30, 30, 500, 50);
        //lockinput= "abanoub nabil";
        /*----------------------------------------*/
        if (blinkSt > 0) {
            if (letter[k] == "-") {
                input = input.substring(0, input.length() - 1);
                  }
            else if (letter[k] == "sp") {
               
        Voice voice;
        FreeTTS freetts;

        voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice != null) {
            voice.allocate();
        }
        freetts = new FreeTTS(voice);
        voice.speak(lockinput2);

        freetts.startup();
        //freetts.urlToSpeech("http://10.0.0.109:8080/");
        freetts.setAudioFile("c:/test.wav");
        freetts.shutdown();
            }else if(letter[k] == "cl"){
                dispose();
            }else if(letter[k] == "AR"){
                new Akeyboardframe().setVisible(true);
                dispose();
            }else {
                input = input + letter[k];
                lockinput = input;
                fill(0);
                textSize(18);
                text(input, 40, 48, 195, 30);
                textSize(48);
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
        text("Blink: " + blinkSt, 10, 10);

        blinkSt = 0;
        fill(0);
        textSize(18);
        text(lockinput, 40, 48, 500, 30);
        textSize(48);
        /*------------------------------------------------------*/
        image(bg, 30, 110);
        noFill();
        stroke(255);
        rect(i, j, 50, 50);
        print("i:" + i + " " + "j:" + j + " " + "k:" + k + "  " + "Blinkst:" + blinkSt);
        /*---------------------------------------------*/
        if (attention > 60) {
            t = 50;
            println("  Attention: " + attention);
             attention=0;
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

            if (k < 35) {
                k = k + 1;
            } else {
                k = 0;
            }
            t = 0;

        }

        t++;
        //noLoop();
    }
    /*------------------------------------*/

    private void blinkEvent(int blinkStrength) {
        blinkSt = blinkStrength;
         blink = 1;
    }
    /*------------------------------------*/

    public void attentionEvent(int attentionLevel) {
        attention = attentionLevel;
    }
    /*------------------------------------*/
/*
    @Override
    public void stop() {
        neuroSocket.stop();
        super.stop();
    }
*/
}
