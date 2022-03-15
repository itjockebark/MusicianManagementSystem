package com.company;

import static com.company.Utilities.*;

import java.util.InputMismatchException;

public class UserInputManagement {
	public static String userInputString() {
		String input = sc.nextLine();
		return input;
	}
	
	public static int userInputInt() {
		int number = -1;
		boolean wrongInput = true;
		while(wrongInput) {			
			try {
				number = sc.nextInt();
				wrongInput = false;
			} catch (InputMismatchException e) {
				System.out.print("""
				\nFel inmatning, det går endast att skriva in nummer!
				Ange nummer: """);
			} 
			finally {
				userInputString();
			}
		}
		return number;
	}
	
	public static double userInputDouble() {
		double number = -1;
		boolean loop = true;
		
		while(loop) {
			try {
				number = sc.nextDouble();
				loop = false;
			} catch (InputMismatchException e) {
				System.out.print("""
				\nFel inmatning, det går endast att skriva in nummer!
				Ange nummer: """);
			} finally {
				userInputString();
			}
		}
		return number;
	}
	
	public static String userInstrumentInput() {
		boolean wrongInput = true;
		String instrument = null;
		while (wrongInput) {
			instrument = userInputString();
			if(instrument.equalsIgnoreCase("piano") || instrument.equalsIgnoreCase("gitarr") ||
			   instrument.equalsIgnoreCase("bas") || instrument.equalsIgnoreCase("trummor")) {
			wrongInput = false;
			}
			else {
				System.out.print("""
				Fel inmatning, var god skriv in \"Piano\", \"Gitarr\", \"Bas\" eller
				\"Trummor\"
				Ange instrument: """);
			}
		}
		return instrument;	
	}
	
	public static String userGenreInput() {
		boolean wrongInput = true;
		String genre = null;
		while (wrongInput) {
			genre = userInputString();
			if(genre.equalsIgnoreCase("rock") || genre.equalsIgnoreCase("blues") ||
			   genre.equalsIgnoreCase("jazz") || genre.equalsIgnoreCase("country")) {
			wrongInput = false;
			}
			else {
				System.out.print("""
				Fel inmatning, var god skriv in \"Rock\", \"Blues\", \"Jazz\" eller 
				\"Country\"
				Ange instrument: """);
			}
		}
		return genre;	
	}
	
	public static String userGenderInput() {
		boolean wrongInput = true;
		String gender = null;
		while (wrongInput) {
			gender = userInputString();
			if(gender.equalsIgnoreCase("kvinna") || gender.equalsIgnoreCase("man")) {
			wrongInput = false;
			}
			else {
				System.out.print("""
				Fel inmatning, var god skriv in \"Man\" eller \"Kvinna\"
				Ange kön:""");
			}
		}
		return gender;	
	}
	
	public static String userPianoTypeInput() {
		boolean wrongInput = true;
		String pianoType = null;
		while (wrongInput) {
			pianoType = userInputString();
			if(pianoType.equalsIgnoreCase("flygel") || pianoType.equalsIgnoreCase("klassiskt") ||
			   pianoType.equalsIgnoreCase("elektroniskt")) {
			wrongInput = false;
			}
			else {
				System.out.print("""
				Fel inmatning, var god skriv in \"Flygel\", \"Klassiskt\" eller 
				\"Elektroniskt\"
				Ange piano: """);
			}
		}
		return pianoType;	
	}
	
	public static String userGuitarBrandInput() {
		boolean wrongInput = true;
		String guitarBrand = null;
		while (wrongInput) {
			guitarBrand = userInputString();
			if(guitarBrand.equalsIgnoreCase("klassisk") || guitarBrand.equalsIgnoreCase("stålsträngad") ||
			   guitarBrand.equalsIgnoreCase("el")) {
			wrongInput = false;
			}
			else {
				System.out.print("""
				Fel inmatning, var god skriv in \"Klassisk\", \"Stålsträngad \" eller 
				\"El\"
				Ange gitarr: """);
			}
		}
		return guitarBrand;	
	}
	
	
	public static String userDrumstickSizeInput() {
		boolean wrongInput = true;
		String drumStickSize = null;
		while (wrongInput) {
			drumStickSize = userInputString();
			if(drumStickSize.equalsIgnoreCase("1a") || drumStickSize.equalsIgnoreCase("5a") ||
			   drumStickSize.equalsIgnoreCase("7a") || drumStickSize.equalsIgnoreCase("2b")) {
			wrongInput = false;
			}
			else {
				System.out.print("""
				Fel inmatning, var god skriv in \"1A\", \"5A\", \"7A\" eller \"2B\"
				Ange storlek: """);
			}
		}
		return drumStickSize;	
	}
	
	public static String userPlectrumShapeInput() {
		boolean wrongInput = true;
		String plectrumShape = null;
		while (wrongInput) {
			plectrumShape = userInputString();
			if(plectrumShape.equalsIgnoreCase("triangel") || plectrumShape.equalsIgnoreCase("droppe") ||
			   plectrumShape.equalsIgnoreCase("rund")) {
			wrongInput = false;
			}
			else {
				System.out.print("""
				Fel inmatning, var god skriv in \"Triangel\", \"Droppe\", eller \"Rund\"
				Ange plektrum: """);
			}
		}
		return plectrumShape;	
	}
}

