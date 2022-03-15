package com.company;

import static com.company.UI.footer;
import static com.company.UI.header;
import static com.company.UserInputManagement.userInputString;
import static com.company.StatisticManagement.totalMusicians;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilities {
	
	static boolean loopProgram = true;
	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Musician> musicians = new ArrayList<>();
	
	public static void printAllMusicians() {
		if(musicians.size() != 0) {
			totalMusicians();
			header();
			for (Musician musician : musicians) {
				if(musician instanceof Pianist) {
					System.out.println("   " + fixString(3, String.valueOf(musician.getId())) +
		            fixString(7, musician.getFirstName()) + 
		            fixString(11, musician.getLastName()) +
		            fixString(6, musician.getGender()) +
					fixString(11, musician.getInstrument()) +
					fixString(7, musician.getGenre()) + 
				    fixString(7, String.valueOf(musician.getSalary())) +
				    fixString(8, String.valueOf(musician.getBonus())) +
					fixString(10, ((Pianist) musician).getPianoType()));
				}
				
				else if(musician instanceof Guitarist) {
					System.out.println("   " + fixString(3, String.valueOf(musician.getId())) +
		            fixString(7, musician.getFirstName()) + 
		            fixString(11, musician.getLastName()) +
		            fixString(6, musician.getGender()) +
					fixString(11, musician.getInstrument()) +
					fixString(7, musician.getGenre()) + 
				    fixString(7, String.valueOf(musician.getSalary())) +
				    fixString(8, String.valueOf(musician.getBonus())) +
					fixString(10, ((Guitarist) musician).getGuitarType()));
				}
				
				else if(musician instanceof Bassist) {
					System.out.println("   " + fixString(3, String.valueOf(musician.getId())) +
		            fixString(7, musician.getFirstName()) + 
		            fixString(11, musician.getLastName()) +
		            fixString(6, musician.getGender()) +
					fixString(11, musician.getInstrument()) +
					fixString(7, musician.getGenre()) + 
				    fixString(7, String.valueOf(musician.getSalary())) +
				    fixString(8, String.valueOf(musician.getBonus())) +
					fixString(10, ((Bassist) musician).getPlectrumSize()));
				}
				else if(musician instanceof Drummer) {
					System.out.println("   " + fixString(3, String.valueOf(musician.getId())) +
		            fixString(7, musician.getFirstName()) + 
		            fixString(11, musician.getLastName()) +
		            fixString(6, musician.getGender()) +
					fixString(11, musician.getInstrument()) +
					fixString(7, musician.getGenre()) + 
				    fixString(7, String.valueOf(musician.getSalary())) +
				    fixString(8, String.valueOf(musician.getBonus())) +
					fixString(10, ((Drummer) musician).getDrumstickSize()));
				}
			}
			footer();
		}
		else {
		System.out.println("\nDet finns inga musiker!");	
		}
	}
	
	public static String fixString(int wantedSize, String stringToFix) {
		if (stringToFix.length() < wantedSize) {
			while (stringToFix.length() < wantedSize) {
				stringToFix = stringToFix+" " ;
	        }
			return stringToFix+"   ";
	    }
		else {
			return stringToFix.substring(0, wantedSize)+"   ";
		}
	}

	public static void pressAnyKeyText() {
	System.out.print("\nKlicka ENTER för att fortsätta");
	userInputString();
	}
	
	public static void wrongInputText() {
		System.out.println("\nFel inmatning, var god försök igen!");
		pressAnyKeyText();
	}
	
	public static void printLineText() {
		System.out.println("------------------------------------------------------------------");
	}
}
