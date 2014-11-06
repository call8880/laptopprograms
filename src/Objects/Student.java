package Objects;

public class Student {

	//instance variables
	private String name;
	private int test1, test2, test3;
	
	//constructor
	public Student(){
		//this code initializes an object by setting the properties
		//this code runs whenever you run new in another class
		
		this("", 0, 0, 0);
		
//		name ="";
//		test1 = 0;
//		test2 = 0;
//		test3 = 0;
		
	}
	//a constructor allows us to make a student with data
	public Student(String n, int t1, int t2, int t3){
			
		name = n;
		test1 = t1;
		test2 = t2;
		test3 = t3;
		
	}
	//this constructor allows us to clone an existing student
	public Student(Student other){
		
		this (other.name, other.test1, other.test2, other.test3);
		
//		name = other.name;
//		test1 = other.test1;
//		test2 = other.test2;
//		test3 = other.test3;
	}
	
	/*instance methods
	these define the student abilities
	cause name is private we need methods to get access
	all setter are void methods and don't need a parameter e.g. return
	there job is to get a property 
	all getter methods are not void
	they are set to the type of data being returned*/

	public void setName(String aname){
		name = aname;
	}
	//because name is a string getName is a public string
	public String getName(){
		return name;
	}
	public void setScore(int test, int score){
		if (test == 1) test1 = score;
		else if (test == 2) test2 = score;
		else test3 = score;
	}
	public int getScore(int test){
		if (test == 1) return test1;
		else if (test == 2) return test2;
		else return test3;
	}
	public int getAverage(){
		return (test1 + test2 + test3)/3;
	}
	public int getHighScore(){
		int result = test1;
		if (test2 > result) result = test2;
		if (test3 > result) result = test3;
		return result;
	}
	
	public String validateData(){
		
		String em = null;
		if (name.equals("")) em = "Name is required.";
		if (test1 < 0 || test1 > 100 || test2 < 0 || test2 > 100 || test3 < 0 || test3 > 100){
			if (em == null) em = "At Least 1 mark is out of the acceptable range";
			else em += "\nAt least 1 mark is out of the acceptable range\n";
		}
		if (em != null) em += "\nPlease re-enter all the data\n";
		return em;
	}
	
	//toString is a common method in most classes it runs automaticlly when you print an object
	public String toString(){
		String result;
		result = "Name:\t" + name;
		result += "\ntest 1:\t" + test1;
		result += "\ntest 2:\t" + test2;
		result += "\ntest 3:\t" + test3;
		result += "\n------------------\n";
		result += "Average:\t" + getAverage();
		return result;
	}	
}
