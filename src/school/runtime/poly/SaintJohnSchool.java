package school.runtime.poly;

public class SaintJohnSchool extends School{

	int schoolHelpers;
	
	public SaintJohnSchool(String schoolName, int schoolStaff, String principalName, int schoolHelpers) {
		super(schoolName, schoolStaff, principalName);
		// TODO Auto-generated constructor stub
		this.schoolHelpers = schoolHelpers;
	}

	@Override
	public void totalStaff() {
		// TODO Auto-generated method stub
		System.out.println("Total Staff: " + (super.schoolStaff + this.schoolHelpers));
	}

}
