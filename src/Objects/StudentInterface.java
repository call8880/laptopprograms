package Objects;

import TerminalIO.*;

public class StudentInterface {

	public static void main(String[] args) {
		
		 Student s = new Student();
		 Student s2 = new Student();
		 KeyboardReader read = new KeyboardReader();
		 
		 String name;
		 int score;
		 
		 while (true){
			 
			 name = read.readLine("Enter the first student's name: ");
			 s.setName(name);
			 for (int i = 1; i <= 3; i++){
				 score = read.readInt("Enter the score for test " + i + ": ");
				 s.setScore(i, score);
			 }
			 String errorm = s.validateData();
			 if (errorm == null) break;
			 else System.out.println(errorm);
		 }
		 while (true){
			 
			 name = read.readLine("Enter the Second student's name: ");
			 s2.setName(name);
			 for (int i = 1; i <= 3; i++){
				 score = read.readInt("Enter the score for test " + i + ": ");
				 s2.setScore(i, score);
			 }
			 String errorm = s2.validateData();
			 if (errorm == null) break;
			 else System.out.println(errorm);
		 }
		 
		 if (s.getHighScore() > s2.getHighScore()) System.out.println(s.getName() + " has the higher score at " + s.getHighScore());
		 else System.out.println(s2.getName() + " has the higher score at " + s2.getHighScore());
		 
		 if (s.getAverage() < s2.getAverage()) System.out.println(s2.getName() + " has the higher average at " + s2.getAverage());
		 else System.out.println(s.getName() + " has the higher average at " + s.getAverage());
		 
	}
}
