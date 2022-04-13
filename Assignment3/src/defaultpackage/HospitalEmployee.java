package defaultpackage;

public class HospitalEmployee {
	protected String name;
	protected int number;
	
	HospitalEmployee(String newName, int newNumber) {
		name = newName;
		number = newNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setName(int newNumber) {
		number = newNumber;
	}
	
	public void work()
	{
	System.out.println (name + " works for the hospital.");
	}

	@Override
	public String toString() {
		return this.name + " " + this.number;
	}
}
