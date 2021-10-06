package school.compile.poly;

public class School {
	
	String schoolName;
	String principalName;
	int schoolStaff;
	
	public School(String schoolName, int schoolStaff, String principalName) {
		super();
		this.schoolName = schoolName;
		this.schoolStaff = schoolStaff;
		this.principalName = principalName;
	}
	
	public void getSchoolInfo() {
		System.out.println("School Name: " + this.schoolName + "\nSchool Principal: " + this.principalName
				+ "\nSchool Staff: " + this.schoolStaff );
	}
	
	public void getSchoolInfo(int schoolhelpers) {
		System.out.println("Total Staff : " + (this.schoolStaff + schoolhelpers));
	}
}
