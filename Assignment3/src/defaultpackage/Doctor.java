package defaultpackage;

public class Doctor extends HospitalEmployee {
	private String speciality;

	Doctor(String newName, int newNumber, String newSpeciality) {
		super(newName, newNumber);
		speciality = newSpeciality;
	}
	
	public String getSpeciality() {
		return speciality;
	}

	@Override
	public String toString() {
		return this.name + " " + this.number + " " + this.speciality;
	}
	
	public void work()
	{
	System.out.println (name + " works for the hospital. " + name + " is a " + speciality + " doctor.");
	}
}
