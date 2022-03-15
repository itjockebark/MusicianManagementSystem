package com.company;

public class Bassist extends Musician {
	
		private String plectrumShape;
		
	public Bassist(String instrument, String genre, String firstName, String lastName, String gender, double salary, String plectrumShape) {
		super(instrument, genre, firstName, lastName, gender, salary, 3000);
		this.plectrumShape = plectrumShape;
	}
	
	public String getPlectrumSize() {
		return plectrumShape;
	}

	public void setPlectrumSize(String plectrumShape) {
		this.plectrumShape = plectrumShape;
	}
	
	public void printInformation() {
		if(plectrumShape.equalsIgnoreCase("triangel")) {
			System.out.println("""
			\nTriangeln är rekommenderad för de som konstant bryter av toppen 
			av sina pletrum!""");
		}
		else if(plectrumShape.equalsIgnoreCase("droppe")) {
			System.out.println("\nDroppen är den mest populära typen av plektrum");
		}
		else if(plectrumShape.equalsIgnoreCase("rund")) {
			System.out.println("""
			\nOm du letar efter att spela din bassträngar med mindre styrka, 
			så är runda plektrum något för dig!""");
		}		
	}

	@Override
	public String toString() {
		return super.toString() + 
			   "\nForm på plektrum: " + plectrumShape;
	}	
		
	
}
