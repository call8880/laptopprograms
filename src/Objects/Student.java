package Objects;


public class Student {
	//instance variables
	private String name;
	private int test[] = new int[3];
	//constructor
	//a constructor allows us to make a student with data
	public Student(String n, int t[]){
		name = n;
		test = t;
	}
	//this constructor allows us to clone an existing student
	public Student(Student other){
		this (other.name, other.test);
		//	name = other.name;
		//	test1 = other.test1;
		//	test2 = other.test2;
		//	test3 = other.test3;
	}
	/*instance methods
these define the student abilities
cause name is private we need methods to get access
all setter are void methods and don't need a parameter e.g. return
there job is to get a property
all getter methods are not void
they are set to the type of data being returned*/
	public void setName(String aname, int t[]){
		name = aname;
		test = t;
	}
	//because name is a string getName is a public string
	public String getName(){
		return name;
	}
	public void setScore(int i, int score){
		test[i-1] = score;
	}
	public int getScore(int i){
		return test[i-1];
	}
	public int getMark(int i){
		return test[i-1];
	}
	public int getAverage(){
		int avg = (test[0] + test[1] + test[2]) / 3;
		return avg;
	}
	public String validateData(){
		String em = null;
		if (name.length() < 2){
			em = "Name is required";
		}
		if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100){
			em += "At least one mark is not within the acceptable range";
		}
		if (em != null){
			em += ("\nre-enter all data");
		}
		return em;
	}
	//toString is a common method in most classes it runs automaticlly when you print an object
	public String toString(){
		String result;
		result = "Name:\t" + name;
		result += "\ntest 1:\t" + test[0];
		result += "\ntest 2:\t" + test[1];
		result += "\ntest 3:\t" + test[2];
		result += "\n------------------\n";
		return result;
	}
}