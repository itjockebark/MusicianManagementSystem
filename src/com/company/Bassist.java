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
			\nTriangeln �r rekommenderad f�r de som konstant bryter av toppen 
			av sina pletrum!""");
		}
		else if(plectrumShape.equalsIgnoreCase("droppe")) {
			System.out.println("\nDroppen �r den mest popul�ra typen av plektrum");
		}
		else if(plectrumShape.equalsIgnoreCase("rund")) {
			System.out.println("""
			\nOm du letar efter att spela din basstr�ngar med mindre styrka, 
			s� �r runda plektrum n�got f�r dig!""");
		}		
	}

	@Override
	public String toString() {
		return super.toString() + 
			   "\nForm p� plektrum: " + plectrumShape;
	}	
		
	
}
