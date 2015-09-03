import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

//Helen Zhang, Block 1, Lightning
//Variables 
int startX, startY, endX, endY;

public void setup(){
	size(800,400);
	background(0);
	strokeWeight(1);
}
public void draw(){
	fill(0,0,0,10);
	rect(0,0,799,399);
	textSize(20);
	fill(100);
	text("C L I C K  O R  D R A G  M O U S E",20,380);
	//The stroke color from drawLighting affects the outline of this rectangle
	//It was unintentional, but it looks cool so I'll leave it in
}

public void mousePressed(){
	initiate();
}
public void mouseDragged(){
	initiate();
}
public void mouseReleased(){
	initiate();
}

public void initiate(){
	startY = 400;
	startX = (int)(Math.random()*800);
	drawLightning();
}

public void drawLightning(){
	stroke((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	while (startY>0){
		endY = startY-(int)(Math.random()*10);
		endX = startX+(int)(Math.random()*40-20);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
