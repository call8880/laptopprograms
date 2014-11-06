package Objects;
import processing.core.*;
import g4p_controls.*;
//g4p == gui for proccesing
import javax.swing.*;

public class ProcessingTemplate extends PApplet {

	GButton gbred, gbgreen;
	Ball b;
	
	public void setup(){
		
		size(600,480, JAVA2D);
		frameRate(60);
		background(0,0,0);
		
		gbred = new GButton(this, 10, 10, 120, 25);
		gbgreen = new GButton(this, 140, 10, 120, 25);
		gbred.setText("Make a red ball");
		gbgreen.setText("Make a green ball");
		
	}
	
	public void handleButtonEvents(GButton button, GEvent event){
		
		int x = (int)(Math.random() * 640) + 1;
		int y = (int)(Math.random() * 480) + 1;
		
		if (button == gbred){
			
			b = new Ball(this, x, y, 'r');
			}
		else if (button == gbgreen){
			b = new Ball(this, x, y, 'g');
		}
		
	}
	
	public void draw(){
		background(0,0,0);
		if (b != null){
			b.Relocate();
			b.Draw();
		}
		
		
	}
}