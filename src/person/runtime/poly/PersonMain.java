package person.runtime.poly;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Engineer("Abhijeet Vidhate", "Software Engineer", 50000, "Male", 12000);
		person.personDisplay();
		person.calculateSalary();
	}

}
