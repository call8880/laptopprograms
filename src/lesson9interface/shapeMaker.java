package lesson9interface;

import TurtleGraphics.*;
import TerminalIO.*;

public class shapeMaker {
	
	public static void main(String args[]){
		shape c, r;
		Pen p = new StandardPen();
		c = new circle(10, 10, 5);
		System.out.println(c.toString());
		r = new rect(10, 10, 5, 5);
		System.out.println(r.toString());
		r.draw(p);
		c.draw(p);
	
	}
	


}
