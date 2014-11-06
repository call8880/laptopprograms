package Objects;

import TerminalIO.*;

public class PayrollInterface {

	public static void main(String[] args) {

		KeyboardReader read = new KeyboardReader();
		Employee e;
		String name;
		int    type;
		double rate;
		int    hours;
		String prompt;
		e = new Employee();
		
		while (true){
			System.out.println("Enter employee data: ");
			name = read.readLine(" name (or <enter> to quit)");
			if (!(e.setName(name)))break;
			
			while (true){
				prompt = " Type (" +e.getTypeRules() + ")"; 
				type = read.readInt(prompt);
				if (e.setType(type))break;
			}
			while (true){
				prompt = "Hourly rate (" + e.getRateRules() + ")";
				rate = read.readDouble(prompt);
				if (e.setRate(rate)) break;
			}
			while (true){
				prompt = " hours ("  + e.getHoursRules() + ") ";
				hours = read.readInt(prompt);
				if (e.setHours(hours)) break;
			}
		
			System.out.print(" The weekly pay for ");
			System.out.print(e.getName());
			System.out.println(" is $" + e.getPay());
		
		}
	}
}
