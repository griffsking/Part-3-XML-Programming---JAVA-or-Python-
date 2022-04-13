package defaultpackage;

public class Surgeon extends Doctor {
	private boolean operating;
	
	Surgeon(String newName, int newNumber, String newSpeciality, boolean newOperation) {
		super(newName, newNumber, newSpeciality);
		operating = newOperation;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.number + " " + getSpeciality() + " Operating: " + this.operating;
	}
	
	public void work()
	{
		if (operating)
			System.out.println (name + " works for the hospital. " + name + " is operating now.");
		else
			System.out.println (name + " works for the hospital. " + name + " is not operating now.");
	}
}
