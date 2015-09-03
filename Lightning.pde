//Helen Zhang, Block 1, Lightning
//Variables 
int startX, startY, endX, endY;

void setup(){
	size(800,400);
	background(0);
	strokeWeight(1);
}
void draw(){
	fill(0,0,0,10);
	rect(0,0,799,399);
	textSize(20);
	fill(100);
	text("C L I C K  O R  D R A G  M O U S E",20,380);
	//The stroke color from drawLighting affects the outline of this rectangle
	//It was unintentional, but it looks cool so I'll leave it in
}

void mousePressed(){
	initiate();
}
void mouseDragged(){
	initiate();
}
void mouseReleased(){
	initiate();
}

void initiate(){
	startY = 400;
	startX = (int)(Math.random()*800);
	drawLightning();
}

void drawLightning(){
	stroke((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	while (startY>0){
		endY = startY-(int)(Math.random()*10);
		endX = startX+(int)(Math.random()*40-20);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}
}