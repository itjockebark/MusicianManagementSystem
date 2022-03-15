package com.company;

import static com.company.Utilities.*;
import static com.company.UserInputManagement.*;

public class CreateManagement {

	public static void addMusician(Musician musician) {	
		musicians.add(musician);
	}
	
	public static void createMusician() {
		boolean createMoreMusicians = true;
		while(createMoreMusicians) {
			System.out.print("""
			------------------------------------------------------------------
			                | Piano | Gitarr | Bas | Trummor |
			------------------------------------------------------------------
			Ange instrument: """);
			String instrument = userInstrumentInput();
			if (instrument.equalsIgnoreCase("piano")) {
				System.out.println("\nSom pianist får du 2500 i bonus!");
				createPianist();
			}
			else if (instrument.equalsIgnoreCase("gitarr")) {
				System.out.println("\nSom gitarrist får du 4000 i bonus!");
				createGuitarist();
			}
			else if (instrument.equalsIgnoreCase("bas")) {
				System.out.println("\nSom basist får du 3000 i bonus!");
				createBassist();
			}
			else if (instrument.equalsIgnoreCase("trummor")) {
				System.out.println("\nSom trummis får du 2000 i bonus!");
				createDrummer();
			}
			System.out.println("""
			------------------------------------------------------------------
			Vill du skapa ytterligare en musiker?
			Skriv in "Ja" för att skapa en till musiker alternativt
			klicka på ENTER för att komma tillbaka till huvudmenyn
			------------------------------------------------------------------
			Var god välj: """);
			String choice = userInputString();
			if(choice.equalsIgnoreCase("ja")) {}
			else {
				createMoreMusicians = false;
			}		
		}
	}	

	public static void createFakeMusicians() {
		Pianist musician1 = new Pianist("Piano", "Rock", "Robert", "Wells", "Man", 30000, "Flygel");
		Pianist musician2 = new Pianist("Piano", "Jazz", "Kris", "Davis", "Kvinna", 40000, "Klassiskt");
		Guitarist musician3 = new Guitarist("Gitarr", "Rock", "Joan", "Jett", "Kvinna", 55000, "El");
		Guitarist musician4 = new Guitarist("Gitarr", "Country", "Willie", "Nelson", "Man", 45000, "Stålsträngad");
		Bassist musician5 = new Bassist("Bas", "Jazz", "Tal", "Wilkenfeld", "Kvinna", 20000, "Rund");
		Bassist musician6 = new Bassist("Bas", "Rock", "Michael", "Belzary", "Man", 30000, "Droppe");
		Drummer musician7 = new Drummer("Trummor", "Rock", "Joey", "Jordison", "Man", 40000, "2B");
		Drummer musician8 = new Drummer("Trummor", "Blues", "Meg", "White", "Kvinna", 45000, "7A");
		
		addMusician(musician1); addMusician(musician2); addMusician(musician3); addMusician(musician4);
		addMusician(musician5); addMusician(musician6); addMusician(musician7); addMusician(musician8);
	
		System.out.println("""
		-------------------------------------------------------
		Du har nu lagt till 8 falska musiker!""");
		pressAnyKeyText();
	}
	  
	public static void createPianist() {
		System.out.print("""
		------------------------------------------------------------------
		                 | Rock | Blues | Jazz | Country |
		------------------------------------------------------------------
		Ange genre: """);
		String genre = userGenreInput();
		System.out.print("""
		------------------------------------------------------------------
		Ange förnamn: """);
		String firstName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		Ange efternamn: """);
		String lastName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		                         | Man | Kvinna |
		------------------------------------------------------------------
		Ange kön: """);
		String gender = userGenderInput();
		if (gender.equalsIgnoreCase("kvinna"))
			System.out.println("\nSom kvinna får du 50% mer i bonus!");
		System.out.print("""
		------------------------------------------------------------------
		Ange lön: """);
		double salary = userInputDouble();
		System.out.print("""
		------------------------------------------------------------------
		                | Flygel | Klassiskt | Elektroniskt |
		------------------------------------------------------------------
		Ange typ av piano: """);
		String pianoType = userPianoTypeInput();
		String instrument = "piano";
		Pianist createPianist = new Pianist(instrument, genre, firstName, lastName, gender, salary, pianoType);
		createPianist.printInformation();
		pressAnyKeyText();
		addMusician(createPianist);
		printLineText();
		System.out.println("Du har nu skapat en ny pianist: \n" + createPianist);
	}
	
	public static void createGuitarist() {
		System.out.print("""
		------------------------------------------------------------------
		                 | Rock | Blues | Jazz | Country |
		------------------------------------------------------------------
		Ange genre: """);
		String genre = userGenreInput();
		System.out.print("""
		------------------------------------------------------------------
		Ange förnamn: """);
		String firstName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		Ange efternamn: """);
		String lastName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		                         | Man | Kvinna |
		------------------------------------------------------------------
		Ange kön: """);
		String gender = userGenderInput();
		if (gender.equalsIgnoreCase("kvinna"))
			System.out.println("\nSom kvinna får du 50% mer i bonus!");
		System.out.print("""
		------------------------------------------------------------------
		Ange lön: """);
		double salary = userInputDouble();
		System.out.print("""
		------------------------------------------------------------------
		                  | Klassisk | Stålsträngad | El |
		------------------------------------------------------------------
		Ange typ av gitarr: """);
		String guitarType = userGuitarBrandInput();
		String instrument = "guitar";
		Guitarist createGuitarist = new Guitarist(instrument, genre, firstName, lastName, gender, salary, guitarType);
		createGuitarist.printInformation();
		pressAnyKeyText();
		addMusician(createGuitarist);
		printLineText();
		System.out.println("Du har nu skapat en ny gitarrist: \n" + createGuitarist);
	}
	
	public static void createBassist() {
		System.out.print("""
		------------------------------------------------------------------
		                 | Rock | Blues | Jazz | Country |
		------------------------------------------------------------------
		Ange genre: """);
		String genre = userGenreInput();
		System.out.print("""
		------------------------------------------------------------------
		Ange förnamn: """);
		String firstName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		Ange efternamn: """);
		String lastName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		                         | Man | Kvinna |
		------------------------------------------------------------------
		Ange kön: """);
		String gender = userGenderInput();
		if (gender.equalsIgnoreCase("kvinna"))
			System.out.println("\nSom kvinna får du 50% mer i bonus!");
		System.out.print("""
		------------------------------------------------------------------
		Ange lön: """);
		double salary = userInputDouble();
		System.out.print("""
		------------------------------------------------------------------
		                    | Triangel | Droppe | Rund |
		------------------------------------------------------------------
		Ange form på pletrum: """);
		String plectrumShape = userPlectrumShapeInput();
		String instrument = "bas";
		Bassist createBassist = new Bassist(instrument, genre, firstName, lastName, gender, salary, plectrumShape);
		createBassist.printInformation();
		pressAnyKeyText();
		addMusician(createBassist);
		printLineText();
		System.out.println("Du har nu skapat en ny basist: \n" + createBassist);
	}
	
	public static void createDrummer() {
		System.out.print("""
		------------------------------------------------------------------
		                 | Rock | Blues | Jazz | Country |
		------------------------------------------------------------------
		Ange genre: """);
		String genre = userGenreInput();
		System.out.print("""
		------------------------------------------------------------------
		Ange förnamn: """);
		String firstName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		Ange efternamn: """);
		String lastName = userInputString();
		System.out.print("""
		------------------------------------------------------------------
		                         | Man | Kvinna |
		------------------------------------------------------------------
		Ange kön: """);
		String gender = userGenderInput();
		if (gender.equalsIgnoreCase("kvinna"))
			System.out.println("\nSom kvinna får du 50% mer i bonus!");
		System.out.print("""
		------------------------------------------------------------------
		Ange lön: """);
		double salary = userInputDouble();
		System.out.print("""
		------------------------------------------------------------------
		                       | 1A | 5A | 7A | 2B |
		------------------------------------------------------------------
		Ange storlek på trumpinnar: """);
		String drumstickSize = userDrumstickSizeInput();
		String instrument = "trummor";
		Drummer createDrummer = new Drummer(instrument, genre, firstName, lastName, gender, salary, drumstickSize);
		createDrummer.printInformation();
		pressAnyKeyText();		
		addMusician(createDrummer);
		printLineText();
		System.out.println("Du har nu skapat en ny trummis: \n" + createDrummer);
	}
}
