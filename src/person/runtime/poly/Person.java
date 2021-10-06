package person.runtime.poly;

public abstract class Person {

	String personName;
	String personOccupation;
	double personSalary;
	String personGender;
	
	public Person(String personName, String personOccupation, double personSalary, String personGender) {
		super();
		this.personName = personName;
		this.personOccupation = personOccupation;
		this.personSalary = personSalary;
		this.personGender = personGender;
	}
	
	public void personDisplay() {
		System.out.println("Person Name: " + this.personName + "\nPerson Occupation: " + this.personOccupation +
				 "\nPerson Gender: " + this.personGender + "\nPerson Salary: " + this.personSalary);
	}
	
	public abstract void calculateSalary();
}
