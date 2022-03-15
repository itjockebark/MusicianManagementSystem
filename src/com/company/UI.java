package com.company;

import static com.company.UserInputManagement.userInputInt;

public class UI {
	
	public static void displayWelcome() {
		System.out.println("""
		------------------------------------------------------------------	
		Hej och v�lkommen till Joakims labb \"Employee Management System\" 
		                       
		                       (Arv och polymorfism)                       	                   
	                              
	                    \"Musician Management System\" """);
	}
	public static int mainMenu() {
		System.out.print("""				
		------------------------------------------------------------------	
		                               Meny                               
		------------------------------------------------------------------				
		1. Hantera musiker
		2. Statistik
		0. Avsluta	
		------------------------------------------------------------------			
		Var god v�lj: """);
		
		int choice = userInputInt();
		return choice;
	}
	
	public static int managementMenu() {
		System.out.print("""				
		------------------------------------------------------------------	
		                        Hantering av musiker
		------------------------------------------------------------------				
		1. L�gg till musiker
		2. Ta bort musiker
		3. Uppdatera musiker
		4. S�k efter musiker
		5. Visa alla musiker
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;	
	}
	
	public static int createMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        L�gg till musiker
		------------------------------------------------------------------			
		1. L�gg till egen musiker	
		2. L�gg till 8 falska musiker		
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------		
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}
	
	public static int removeMenu() {
		System.out.print("""				
		------------------------------------------------------------------	
		                        Ta bort musiker
		------------------------------------------------------------------				
		1. Ta bort musiker via ID
		2. Ta bort musiker via f�rnamn
		3. Ta bort musiker via efternamn
		4. Ta bort musiker via k�n
		5. Ta bort musiker via instrument
		6. Ta bort musiker via genre
		7. Ta bort musiker via l�n
		8. Ta bort musiker via bonus	
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------				
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}
	
	public static int updateMenu() {
		System.out.print("""				
		-------------------------------------------------------------------
		                        Uppdaterering av musiker
		------------------------------------------------------------------			
		1. Uppdatera f�rnamn
		2. Uppdatera efternamn
		3. Uppdatera k�n
		4. Uppdatera genre
		5. Uppdatera l�n
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------		
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}
	public static int searchMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        S�k efter musiker
		------------------------------------------------------------------			
		1. S�k efter musiker via ID
		2. S�k efter musiker via f�rnamn
		3. S�k efter musiker via efternamn
		4. S�k efter musiker via k�n
		5. S�k efter musiker via instrument
		6. S�k efter musiker via genre
		7. S�k efter musiker via l�n
		8. S�k efter musiker via bonus	
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------		
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}
	
	public static int statisticMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                             Statistik 
		------------------------------------------------------------------			
		1. Statistik av musiker
		2. Statistik av l�n
		3. Statistik av bonus

		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}	
	
	public static int musicianStatisticMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        Statistik av musiker
		------------------------------------------------------------------			
		1. Totala antalet musiker
		2. Andelen kvinnor 
		3. Andelen gitarrister 
		4. Andelen m�n som spelar genren rock
		5. Andelen kvinnor som spelar piano i genren jazz 
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}	
	
	
	public static int salaryStatisticMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        Statistik av l�n
		------------------------------------------------------------------
		1. Total l�n			
		2. Genomsnittlig l�n
		3. H�gst l�n
		4. L�gst l�n
		5. Andelen musiker med l�n �ver 35000
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}	
	
	public static int bonusStatisticMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        Statistik av bonus
		------------------------------------------------------------------
		1. Total bonus			
		2. Genomsnittlig bonus
		3. H�gst bonus
		4. L�gst bonus
		5. Andelen musiker med bonus under 3500
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god v�lj: """);
		int choice = userInputInt();
		return choice;
	}	
	
	public static void header() {
        System.out.println("""
        _______________________________________________________________________________________________     
      
          |ID|  |NAMN|    |EEFTERNAMN|  |K�N|    |INSTRUMENT|  |GENRE|   |L�N|     |BONUS|    |EXTRA|
        _______________________________________________________________________________________________""");
    }			
	
	 public static void footer(){
		 System.out.println("_______________________________________________________________________________________________\n");
	    }
}

