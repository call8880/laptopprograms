package Objects;

public class guessMachine {

	private int num;
	private int numGuess;
	private int guess;

	
	public guessMachine(){
		num = (int)(Math.random() * 100) + 1;
		guess = 0;
		numGuess = 0;
	}

	public boolean setGuess(int inguess) {
		
		if (inguess <= 100 && inguess >= 0){
			guess = inguess;
			return true;
		}
		else return false;
	}

	public String giveHint(int guess) {
		
		if (guess < num){
			return "to Low";
		}
		else if (guess > num){
			return "to High";
		}
		else return "You Got it";
	}
	
	public int getNumGuesses(){
		
		numGuess++;
		return numGuess;
		
	}

	
}
