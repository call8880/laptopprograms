package Objects;

import TerminalIO.*;

public class Lucky7 {

	public static void main(String[] args) {
		
		int cash;
		int rolls = 0;
		int max;
		int bestroll = 0;
		int roll;
		KeyboardReader read = new KeyboardReader();
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		//have user enter starting amount of cash 
		System.out.println("Enter the am amount of cash you start with: ");
		cash = read.readInt();
		
		max = cash;
		
		while(cash > 0){
			
			roll = d1.Roll() + d2.Roll();
			if (roll == 7) cash += 4;
			else cash--;
			rolls++;
			
			if (cash > max){
				max = cash;
				bestroll = rolls;
			}
		}
		//print the turns till they ran out of money and when they should have stopped
		System.out.println("You have run out of money after " + rolls + " rolls");
		System.out.println("You should have quit after " + bestroll + " rolls when you had won " + max);
	
	}

}
