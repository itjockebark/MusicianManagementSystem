package com.company;

import static com.company.Utilities.*;
import static com.company.UserInputManagement.*;

public class SearchManagement {
	public static void searchById() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------	
    		Ange ID: """);
    		int idChoice = userInputInt();
    		for (Musician musician : musicians) {
    			if (musician.getId() == idChoice) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande ID!");
    		}
    	pressAnyKeyText();
		 }
		else {
    		printAllMusicians();
    		pressAnyKeyText();
    	}
	}
	
	public static void searchByFirstName() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------	
    		Ange förnamn: """);
    		String firstNameChoice = userInputString();
    		for (Musician musician : musicians) {
    			if (musician.getFirstName().equalsIgnoreCase(firstNameChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande förnamn!");
    		}
    	pressAnyKeyText();
		 }
		else {
			printAllMusicians();
    		pressAnyKeyText();
    	}
	}
	
	public static void searchByLastName() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------	
    		Ange efternamn: """);
    		String lastNameChoice = userInputString();
    		for (Musician musician : musicians) {
    			if (musician.getLastName().equalsIgnoreCase(lastNameChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande efternamn!");
    		}
    	pressAnyKeyText();
		 }
		else {
			printAllMusicians();
    		pressAnyKeyText();
    	}
	}
	
	public static void searchByGender() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------	
    		Ange kön: """);
    		String genderChoice = userInputString();
    		for (Musician musician : musicians) {
    			if (musician.getGender().equalsIgnoreCase(genderChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande kön");
    		}
    	pressAnyKeyText();
		 }
		else {
			printAllMusicians();
    		pressAnyKeyText();
    	}
	}
	
	public static void searchByInstrument() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange instrument: """);
    		String instrumentChoice = userInputString();
    		for (Musician musician : musicians) {
    			if (musician.getInstrument().equalsIgnoreCase(instrumentChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande instrument");
    		}
    	pressAnyKeyText();
		 }
		else {
			printAllMusicians();
    		pressAnyKeyText();
    	}
	}
	
	public static void searchByGenre() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange genre: """);
    		String genreChoice = userInputString();
    		for (Musician musician : musicians) {
    			if (musician.getGenre().equalsIgnoreCase(genreChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande genre");
    		}
    	pressAnyKeyText();
		 }
		else {
			printAllMusicians();
    		pressAnyKeyText();
    	}
	}
	
	public static void searchBySalary() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange lön: """);
    		int salaryChoice = userInputInt();
    		for (Musician musician : musicians) {
    			if (musician.getSalary() == salaryChoice) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande lön!");
    		}
    	pressAnyKeyText();
		 }
		else {
			printAllMusicians();
    		pressAnyKeyText();
    	}
	}
	
	public static void searchByBonus() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		System.out.print("""
    		------------------------------------------------------------------	
    		Ange bonus: """);
    		int bonusChoice = userInputInt();
    		for (Musician musician : musicians) {
    			if (musician.getBonus() == bonusChoice) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Sökning lyckades: \n" + (musician));
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande bonus!");
    		}
    	pressAnyKeyText();
		 }
		else {
			printAllMusicians();
    		pressAnyKeyText();
    	}
	}
}
