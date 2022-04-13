package defaultpackage;

public class Nurse extends HospitalEmployee {
	private int numOfPatients;

	Nurse(String newName, int newNumber, int newNumOfPatients) {
		super(newName, newNumber);
		numOfPatients = newNumOfPatients;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.number + " has " + this.numOfPatients + " patients.";
	}
	
	public void work()
	{
	System.out.println (name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
	}
}
