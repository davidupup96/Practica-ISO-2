package it1;

public class Mechanic {

	String name;
	String ID;
	
	
	public Mechanic(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
}
