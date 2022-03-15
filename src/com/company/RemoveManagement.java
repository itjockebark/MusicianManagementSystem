package com.company;

import static com.company.Utilities.*;
import static com.company.UserInputManagement.*;
import static com.company.Musician.totalMusicians;

public class RemoveManagement {
	
	public static void removeById() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange ID: """);
    		int idChoice = userInputInt();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getId() == idChoice) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
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
	
	public static void removeByFirstName() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange förnamn: """);
    		String firstNameChoice = userInputString();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getFirstName().equalsIgnoreCase(firstNameChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
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
	
	public static void removeByLastName() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange efternamn: """);
    		String lastNameChoice = userInputString();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getLastName().equalsIgnoreCase(lastNameChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
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
	
	public static void removeByGender() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange kön: """);
    		String genderChoice = userInputString();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getGender().equalsIgnoreCase(genderChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande kön!");
    		}
    	pressAnyKeyText();
		 }
    	else {
    		printAllMusicians();
    		pressAnyKeyText();
    	}
    }	
	
	public static void removeByInstrument() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange instrument: """);
    		String instrumentChoice = userInputString();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getInstrument().equalsIgnoreCase(instrumentChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande instrument!");
    		}
    	pressAnyKeyText();
		 }
    	else {
    		printAllMusicians();
    		pressAnyKeyText();
    	}
    }	
	
	public static void removeByGenre() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange genre: """);
    		String genreChoice = userInputString();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getGenre().equalsIgnoreCase(genreChoice)) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
    			}
    		}
    		if(wrongInput == true) {
    			System.out.println("Kunde inte hitta någon musiker med motsvarande genre!");
    		}
    	pressAnyKeyText();
		 }
    	else {
    		printAllMusicians();
    		pressAnyKeyText();
    	}
    }	
	
	public static void removeBySalary() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange lön: """);
    		double salaryChoice = userInputDouble();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getId() == salaryChoice) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
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
	
	public static void removeByBonus() {
    	if(musicians.size() != 0) {	
    		boolean wrongInput = true;
    		printAllMusicians();
    		System.out.print("""
    		------------------------------------------------------------------
    		Ange bonus: """);
    		double bonusChoice = userInputDouble();
    		for (int i = musicians.size() - 1; i >= 0; i--) {
    			if (musicians.get(i).getId() == bonusChoice) {
    				wrongInput = false;
    				printLineText();
    				System.out.println("Du har nu tagit bort musikern: \n" + musicians.get(i));
    				musicians.remove(i);
    				totalMusicians--;
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
