package com.company;

import static com.company.UserInputManagement.userInputInt;

public class UI {
	
	public static void displayWelcome() {
		System.out.println("""
		------------------------------------------------------------------	
		Hej och välkommen till Joakims labb \"Employee Management System\" 
		                       
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
		Var god välj: """);
		
		int choice = userInputInt();
		return choice;
	}
	
	public static int managementMenu() {
		System.out.print("""				
		------------------------------------------------------------------	
		                        Hantering av musiker
		------------------------------------------------------------------				
		1. Lägg till musiker
		2. Ta bort musiker
		3. Uppdatera musiker
		4. Sök efter musiker
		5. Visa alla musiker
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god välj: """);
		int choice = userInputInt();
		return choice;	
	}
	
	public static int createMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        Lägg till musiker
		------------------------------------------------------------------			
		1. Lägg till egen musiker	
		2. Lägg till 8 falska musiker		
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------		
		Var god välj: """);
		int choice = userInputInt();
		return choice;
	}
	
	public static int removeMenu() {
		System.out.print("""				
		------------------------------------------------------------------	
		                        Ta bort musiker
		------------------------------------------------------------------				
		1. Ta bort musiker via ID
		2. Ta bort musiker via förnamn
		3. Ta bort musiker via efternamn
		4. Ta bort musiker via kön
		5. Ta bort musiker via instrument
		6. Ta bort musiker via genre
		7. Ta bort musiker via lön
		8. Ta bort musiker via bonus	
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------				
		Var god välj: """);
		int choice = userInputInt();
		return choice;
	}
	
	public static int updateMenu() {
		System.out.print("""				
		-------------------------------------------------------------------
		                        Uppdaterering av musiker
		------------------------------------------------------------------			
		1. Uppdatera förnamn
		2. Uppdatera efternamn
		3. Uppdatera kön
		4. Uppdatera genre
		5. Uppdatera lön
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------		
		Var god välj: """);
		int choice = userInputInt();
		return choice;
	}
	public static int searchMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        Sök efter musiker
		------------------------------------------------------------------			
		1. Sök efter musiker via ID
		2. Sök efter musiker via förnamn
		3. Sök efter musiker via efternamn
		4. Sök efter musiker via kön
		5. Sök efter musiker via instrument
		6. Sök efter musiker via genre
		7. Sök efter musiker via lön
		8. Sök efter musiker via bonus	
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------		
		Var god välj: """);
		int choice = userInputInt();
		return choice;
	}
	
	public static int statisticMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                             Statistik 
		------------------------------------------------------------------			
		1. Statistik av musiker
		2. Statistik av lön
		3. Statistik av bonus

		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god välj: """);
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
		4. Andelen män som spelar genren rock
		5. Andelen kvinnor som spelar piano i genren jazz 
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god välj: """);
		int choice = userInputInt();
		return choice;
	}	
	
	
	public static int salaryStatisticMenu() {
		System.out.print("""				
		------------------------------------------------------------------
		                        Statistik av lön
		------------------------------------------------------------------
		1. Total lön			
		2. Genomsnittlig lön
		3. Högst lön
		4. Lägst lön
		5. Andelen musiker med lön över 35000
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god välj: """);
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
		3. Högst bonus
		4. Lägst bonus
		5. Andelen musiker med bonus under 3500
		0. Tillbaka till huvudmenyn		
		------------------------------------------------------------------			
		Var god välj: """);
		int choice = userInputInt();
		return choice;
	}	
	
	public static void header() {
        System.out.println("""
        _______________________________________________________________________________________________     
      
          |ID|  |NAMN|    |EEFTERNAMN|  |KÖN|    |INSTRUMENT|  |GENRE|   |LÖN|     |BONUS|    |EXTRA|
        _______________________________________________________________________________________________""");
    }			
	
	 public static void footer(){
		 System.out.println("_______________________________________________________________________________________________\n");
	    }
}

