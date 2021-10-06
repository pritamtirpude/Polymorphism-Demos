package person.runtime.poly;

public class Engineer extends Person {
	
	double intensive;
	public Engineer(String personName, String personOccupation, double personSalary, String personGender, double intensive) {
		super(personName, personOccupation, personSalary, personGender);
		// TODO Auto-generated constructor stub
		this.intensive = intensive;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Calculated Salary: " +  (super.personSalary + this.intensive));
	}

}
