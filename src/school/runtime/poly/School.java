package school.runtime.poly;

public abstract class School {
	String schoolName;
	String principalName;
	int schoolStaff;
	
	public School(String schoolName, int schoolStaff, String principalName) {
		super();
		this.schoolName = schoolName;
		this.schoolStaff = schoolStaff;
		this.principalName = principalName;
	}
	
	public void schoolInfo() {
		System.out.println("School Name: " + this.schoolName + "\nSchool Principal: " + this.principalName
				+ "\nSchool Staff: " + this.schoolStaff );
	}
	
	public abstract void totalStaff();
}
