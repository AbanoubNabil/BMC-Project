package graduation;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.*;
import neurosky.*;
import processing.core.PApplet;

public class MyProcessingSketch extends PApplet {

    
float a;
Point mouse ;
Robot rr ;
int clickstatec=0;
ThinkGearSocket neuroSocket;

//to move mouse horizntal

void movemousehorizntal(int param){
  float t ;
  t= width;
 while(clickstatec==1){ 
  t= (float) (t - 0.001);
  if (t < 0) {
    t = width;
  }
 rr.mouseMove((int)t*5, (int)(param*2.2));
 }
  
}

// handle the right click and iterations
void rightclick(){
while(clickstatec==2){
  
   Point p1 = MouseInfo.getPointerInfo().getLocation();
 
    
  rr.mousePress(InputEvent.BUTTON3_MASK); 
 
  rr.mouseRelease(InputEvent.BUTTON3_MASK);
 while (clickstatec==2){
   Point p2 = MouseInfo.getPointerInfo().getLocation();
  
   if (p1.x == p2.x )
   {
   rr.keyPress(KeyEvent.VK_DOWN);
   rr.keyRelease(KeyEvent.VK_DOWN);
 try
 {
 Thread.sleep(1000);
 }
 catch (InterruptedException e)
 {
 exit();
 }
   }
   
 }
 println("in right click " );
}
 }

// handle the key enter pressed

void  enterPressed(int state){
   while(state==3){
     
      println("in enterpressed " );
  Point p1 = MouseInfo.getPointerInfo().getLocation();
 
  rr.keyPress(KeyEvent.VK_ENTER);
  rr.keyRelease(KeyEvent.VK_ENTER);
state=0 ;
clickstatec=0;
   }
   
   }
//action listener to recieve the blink events 
public void connect(){
    ThinkGearSocket neuro_Socket;
    neuro_Socket = new ThinkGearSocket(this);
  try {
    neuro_Socket.start();
  } 
  catch (ConnectException e) {
    println("Is ThinkGear running??");
    
  }
  System.out.println("i'm connect from my processing sketch");
}
public void blinkEvent(int blinkStrength) {
  
  if (blinkStrength > 50) {
    
    if(clickstatec==0){
    clickstatec=1;
        
  }else if(clickstatec==1){
    clickstatec=2;
   
  }else if(clickstatec==2){
    clickstatec=3;
   
  }else if(clickstatec==3){
    clickstatec=4;
   
  }else if(clickstatec==4){
    clickstatec=0;
   
  }
 
  }
  println("blinkStrength: " + blinkStrength);
}

@Override
public void setup() {
        //the applet setting
 // size( displayWidth, displayHeight );
 size(340, 240);
try
  {
    rr = new Robot();
  }
  catch (AWTException e)
  {
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
connect() ;
  a = height/2;
  
  }

@Override
  public void draw() {
      
 background(0);
    size(340, 240);
  background(0);
  a = (float) (a - 0.9);
  if (a < 0) {
    a = height;
  }
   
  int b =(int)a ;
  if(clickstatec==0){
     textSize(20);
    fill(0, 102, 153);
    textAlign(LEFT);
    text("use instructions \n1-first blink to move horizntal\n2-second blink to stop\n3-third blink to choose\n4-fourth blink to try again", 10,40);
  
      rr.mouseMove(700 ,(int)(4*a));
   
}else if(clickstatec==1)  {
   textSize(20);
    fill(0, 102, 153);
    textAlign(LEFT);
    text("use instructions \n1-first blink to move horizntal\n2-second blink to stop\n3-third blink to choose\n4-fourth blink to try again", 10,40);
  
    movemousehorizntal(b);
}else if(clickstatec==2)  {
   textSize(20);
    fill(0, 102, 153);
    textAlign(LEFT);
    text("use instructions \n1-first blink to move horizntal\n2-second blink to stop\n3-third blink to choose\n4-fourth blink to try again", 10,40);
  
    rightclick() ;
}else if(clickstatec==3)  {
   textSize(20);
    fill(0, 102, 153);
    textAlign(LEFT);
    text("use instructions \n1-first blink to move horizntal\n2-second blink to stop\n3-third blink to choose\n4-fourth blink to try again", 10,40);
  
    enterPressed(clickstatec) ;
 }
 
  }
    
}
