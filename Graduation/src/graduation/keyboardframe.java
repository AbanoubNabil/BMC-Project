package graduation;

import com.sun.speech.freetts.FreeTTS;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import guru.ttslib.TTS;

public class keyboardframe extends javax.swing.JFrame {
    TTS tts;
    
    public keyboardframe() {
        this.setSize(630,330); //The window Dimensions
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.JPanel panel = new javax.swing.JPanel();
        // panel.setBounds(400, 200, 600, 600);
        processing.core.PApplet sketch = new brainkeyboard();
        panel.add(sketch);
        this.add(panel);
        sketch.init(); //this is the function used to start the execution of the sketch
        this.setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 600, 600));
        setPreferredSize(new java.awt.Dimension(630, 330));

        jMenu1.setText("speak");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
         //  keyboardframe s=new keyboardframe();
        brainkeyboard c = new brainkeyboard();

        Voice voice;
        FreeTTS freetts;

        voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice != null) {
            voice.allocate();
        }
        freetts = new FreeTTS(voice);
        voice.speak(brainkeyboard.lockinput);

        freetts.startup();
        //freetts.urlToSpeech("http://10.0.0.109:8080/");
        freetts.setAudioFile("c:/test.wav");
        freetts.shutdown();
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        
          //  keyboardframe s=new keyboardframe();
        brainkeyboard c = new brainkeyboard();

        Voice voice;
        FreeTTS freetts;

        voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice != null) {
            voice.allocate();
        }
        freetts = new FreeTTS(voice);
        String ss=brainkeyboard.lockinput ;
        voice.speak(ss);

        freetts.startup();
        //freetts.urlToSpeech("http://10.0.0.109:8080/");
        freetts.setAudioFile("c:/test.wav");
        freetts.shutdown();
        
        
    }//GEN-LAST:event_jMenu1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
