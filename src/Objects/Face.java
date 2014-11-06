package Objects;

import java.awt.Color;
import processing.core.*;

public class Face {
	
	private float xPosition, yPosition, radius, mood;
	private Color color;
	private PApplet pen;
	
	public Face(PApplet p, float x, float y){
		xPosition = x;
		yPosition = y;
		radius = 100;
		color = Color.red;
		pen = p;
		mood=1;
	}
	public void Draw(){
		pen.stroke(0);
		pen.fill(color.getRed(),color.getGreen(),color.getBlue());
		drawCircle(xPosition, yPosition, radius, radius);
		//yellow eyes
		pen.fill(255,255,0);
		drawCircle(xPosition-radius/5, yPosition-radius/5, radius/4, radius/4);
		drawCircle(xPosition+radius/5, yPosition-radius/5, radius/4, radius/4);
		//mouth 
		if(mood==1){
		drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition+.20*radius, yPosition+.3*radius);
		drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition-.25*radius, yPosition+.2*radius);
		drawLine(xPosition+.2*radius, yPosition+.3*radius, xPosition+.25*radius, yPosition+.2*radius);
		}
		else{
			drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition+.20*radius, yPosition+.3*radius);
			drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition-.25*radius, yPosition+.4*radius);
			drawLine(xPosition+.2*radius, yPosition+.3*radius, xPosition+.25*radius, yPosition+.4*radius);
		}
	}
	private void drawCircle(float x, float y, float w, float h){
		pen.ellipse(x, y, w, h);
	}
	private void drawLine(double x1, double y1, double x2, double y2){
		pen.line((float) x1, (float) y1, (float) x2, (float) y2);
	}
	public void erase(){
		pen.fill(255);
		pen.noStroke();
		pen.ellipse(xPosition, yPosition, radius+5, radius+5);
	}
	public void move(float x, float y){
		xPosition = x;
		yPosition = y;
		Draw();
	}
	public void setColor(Color x){
		color = x;
		Draw();
	}
	public void Resize(float x){
		radius = x;
		Draw();
	}
	public void setMood(){
	
		if(mood==1)
			mood=0;
		else {
			mood=1;
		}
	}
}
