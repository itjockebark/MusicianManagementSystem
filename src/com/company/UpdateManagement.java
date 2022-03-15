package com.company;

import static com.company.Utilities.*;
import static com.company.UserInputManagement.*;

public class UpdateManagement {
	
	public static void updateFirstName() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange ID: """);
    		int idChoice = userInputInt(); 		
    		for (Musician musician : musicians) {    			
    			if (musician.getId() == idChoice) {
    				System.out.print("""
    			    ------------------------------------------------------------------	
    			    Ange nytt förnamn: """);
    			    String firstName = userInputString();
    				wrongInput = false;
    				printLineText();
    				musician.setFirstName(firstName);
    				System.out.println("Förnamnet är nu uppdaterat till: " + musician.getFirstName());
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
	
	public static void updateLastName() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange ID: """);
    		int idChoice = userInputInt();   	
    		for (Musician musician : musicians) {
    			if (musician.getId() == idChoice) {
    				System.out.print("""
    			    ------------------------------------------------------------------
    			    Ange nytt efternamn: """);
    			    String lastName = userInputString();
    				wrongInput = false;
    				printLineText();
    				musician.setLastName(lastName);
    				System.out.println("Efternamnet är nu uppdaterat till: " + musician.getLastName());
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
	
	public static void updateGenre() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange ID: """);
    		int idChoice = userInputInt();   	
    		for (Musician musician : musicians) {
    			if (musician.getId() == idChoice) {
    				System.out.print("""
    			    ------------------------------------------------------------------
    			    Ange nytt genre: """);
    			    String genre = userInputString();
    				wrongInput = false;
    				printLineText();
    				musician.setGenre(genre);
    				System.out.println("Genre är nu uppdaterat till: " + musician.getGenre());
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
	
	
	public static void updateGender() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------	
    		Ange ID: """);
    		int idChoice = userInputInt();   		
    		for (Musician musician : musicians) {
    			if (musician.getId() == idChoice) {
    				System.out.print("""
    			    ------------------------------------------------------------------
    			    Ange nytt kön: """);
    			    String gender = userGenderInput();
    				wrongInput = false;
    				printLineText();
    				musician.setGender(gender);
    				System.out.println("Könet är nu uppdaterat till: " + musician.getGender());
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
	
	public static void updateSalary() {
	  	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange ID: """);
    		int idChoice = userInputInt();
    		for (Musician musician : musicians) {
    			if (musician.getId() == idChoice) {
    				System.out.print("""
    			    ------------------------------------------------------------------
    			    Ange ny lön: """);
    			    double salary = userInputDouble();
    				wrongInput = false;
    				printLineText();
    				musician.setSalary(salary);
    	    		System.out.println("Lönen är nu uppdaterad till: " + musician.getSalary());
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
	
	
}
