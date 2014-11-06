package Objects;

import java.awt.Color;
import processing.core.*;

public class Ball {
	
	private float xPosition, yPosition, radius;
	private Color color;
	
	private PApplet pen;
	
	public Ball(PApplet p, float x, float y, char c){
		xPosition = x;
		yPosition = y;
		pen = p;
		//radius = 100;
		if (c == 'r'){
			pen.fill(255,0,0);
		}
		else pen.fill(0, 255, 0);
	}
	
	public void Draw(){
		pen.ellipse(xPosition, yPosition, 20, 20);
	}
	public void Relocate(){
		xPosition = (int)(Math.random() * 640) + 1;
		yPosition = (int)(Math.random() * 480) + 1;
	}
}
