package com.company;


public class Drummer extends Musician {
	
		private String drumstickSize;
		
	public Drummer(String instrument, String genre, String firstName, String lastName, String gender, double salary, String drumstickSize) {
		super(instrument, genre, firstName, lastName, gender, salary, 2000);
		this.drumstickSize = drumstickSize;		
	}
	
	public String getDrumstickSize() {
		return drumstickSize;
	}

	public void setDrumstickSize(String drumstickSize) {
		this.drumstickSize = drumstickSize;
	}
	
	public void printInformation() {
		if(drumstickSize.equalsIgnoreCase("1A")) {
			System.out.println("\n1A �r de l�ngsta trumpinnarna!");
		}
		else if(drumstickSize.equalsIgnoreCase("5A")) {
			System.out.println("\n5A �r \"standard\" trumpinnarna!");
		}
		
		else if(drumstickSize.equalsIgnoreCase("7A")) {
			System.out.println("\n7A �r tunna och ett ideliskt val f�r jazz!");
		}
		
		else if(drumstickSize.equalsIgnoreCase("2B")) {
			System.out.println("\n2B �r tjockast av alla trumpinnar och ett idealiskt val f�r rock!");
		}	
	}

	@Override
	public String toString() {
		return super.toString() + 
			   "\nStorlek p� trumpinnar: " + drumstickSize;
	}	
}
