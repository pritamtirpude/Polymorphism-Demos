package person.compile.poly;

public class Person {

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
	
	public void getPersonsInfo() {
		System.out.println("Person Name: " + this.personName + "\nPerson Occupation: " + this.personOccupation +
				 "\nPerson Gender: " + this.personGender + "\nPerson Salary: " + this.personSalary);
	}
	
	public void getPersonsInfo(double allowance) {
		System.out.println("Allowance : " + allowance);
	}
}
