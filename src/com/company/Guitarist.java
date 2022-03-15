package com.company;

public class Guitarist extends Musician {
	
	private String guitarType;
	
	public Guitarist(String instrument, String genre, String firstName, String lastName, String gender, double salary, String guitarType) {
		super(instrument, genre, firstName, lastName, gender, salary, 4000);
		this.guitarType = guitarType;
	}
	
	public String getGuitarType() {
		return guitarType;
	}

	public void setGuitarType(String guitarType) {
		this.guitarType = guitarType;
	}
	
	public void printInformation() {
		if(guitarType.equalsIgnoreCase("klassisk")) {
			System.out.println("""
				\nEn klassisk gitarr är en akustisk gitarr som har nylonsträngar, 
				kallas även för nylonsträngad alternativt spansk gitarr! """);
		}
		
		else if(guitarType.equalsIgnoreCase("stålsträngad")) {
			System.out.println("""
				\nEn stålsträngad gitarr är en akustisk gitarr med stålsträngar
				som ibland kallas för westerngitarr! """);
		}
		
		else if(guitarType.equalsIgnoreCase("el")) {
			System.out.println("""
				\nEn elgitarr är en elektrisk gitarr, vilket innebär att ljudet 
				huvudsakligen uppstår på konstgjord väg! """);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
			   "\nTyp av gitarr: " + guitarType;
	}
	
}
	
	
