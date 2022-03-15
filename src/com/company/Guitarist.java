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
				\nEn klassisk gitarr �r en akustisk gitarr som har nylonstr�ngar, 
				kallas �ven f�r nylonstr�ngad alternativt spansk gitarr! """);
		}
		
		else if(guitarType.equalsIgnoreCase("st�lstr�ngad")) {
			System.out.println("""
				\nEn st�lstr�ngad gitarr �r en akustisk gitarr med st�lstr�ngar
				som ibland kallas f�r westerngitarr! """);
		}
		
		else if(guitarType.equalsIgnoreCase("el")) {
			System.out.println("""
				\nEn elgitarr �r en elektrisk gitarr, vilket inneb�r att ljudet 
				huvudsakligen uppst�r p� konstgjord v�g! """);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
			   "\nTyp av gitarr: " + guitarType;
	}
	
}
	
	
