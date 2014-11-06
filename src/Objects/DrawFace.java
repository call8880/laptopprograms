package Objects;

import java.awt.Color;
import processing.core.*;
import g4p_controls.*;
import javax.swing.*;

public class DrawFace extends PApplet {
	
	Face f;
	GButton gb1;
	GButton gb2;
	GButton gb3;
	GButton gb4;
	float x, y, z;
	
	public void setup(){
		
		setSize(400, 401);
		background(255);
		f = new Face(this, 200, 200);
		gb1 = new GButton(this, 22, 20, 80, 30);
		gb1.setText("Move face");
		gb2 = new GButton(this, 119, 20, 80, 30);
		gb2.setText("Resize face");
		gb3 = new GButton(this, 217, 20, 80, 30);
		gb3.setText("Change color");
		gb4 = new GButton(this, 311, 20, 80, 30);
		gb4.setText("Set mood");
		
	}
	
	public void handleButtonEvents(GButton button, GEvent event){
		
		if (button == gb1){
			
			x = Float.parseFloat((JOptionPane.showInputDialog(this, "Enter new x: ")));
			y = Float.parseFloat(JOptionPane.showInputDialog(this, "enter new y: "));
			
			f.erase();
			f.move(x, y);
		}
		else if (button == gb2){
			z = Float.parseFloat((JOptionPane.showInputDialog(this, "Enter a new Radius ")));
			
			f.erase();
			f.Resize(z);
		}
		else if (button == gb3){
			Color newcolor = JColorChooser.showDialog(this, "Select new colour", Color.red);
			f.erase();
			f.setColor(newcolor);
		}
		else{
			f.erase();
			f.setMood();
		}
	}
	public void draw(){
		f.Draw();
	}
}
