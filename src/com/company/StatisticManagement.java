package com.company;

import static com.company.Utilities.*;
import static com.company.Musician.*;
public class StatisticManagement {
	
	public static void totalMusicians() {
		System.out.println("\nDet finns totalt " + totalMusicians + " musiker");
	}
	
	public static void guitaristsInPercent() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				if (musician.getInstrument().equalsIgnoreCase("gitarr")) {
					sum++;
				}
			}
			System.out.println("\nAndelen musiker som �r gitarrister: " + sum / totalMusicians * 100 + "%");		
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void womenInPercent() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				if (musician.getGender().equalsIgnoreCase("kvinna")) {
					sum++;
				}
			}
			System.out.println("\nAndelen kvinnor som �r musiker: " + sum / totalMusicians * 100 + "%");
		}
	    else {
    		printAllMusicians();
    		pressAnyKeyText();
	     }
	  }
	
	public static void menPlayingRockInPercent() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				if (musician.getGender().equalsIgnoreCase("man") && musician.getGenre().equalsIgnoreCase("rock")) {
					sum++;
				}
			}
			System.out.println("\nAndelen m�n som spelar genren rock �r: " + sum / totalMusicians * 100 + "%");		
		}
	    else {
    		printAllMusicians();
    		pressAnyKeyText();
	     }
	}
	
	public static void womenPlayingPianoJazzInPercent() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				if (musician.getGender().equalsIgnoreCase("kvinna") && 
					musician.getInstrument().equalsIgnoreCase("piano") &&
					musician.getGenre().equalsIgnoreCase("jazz")) {
					sum++;
				} 
			}
			System.out.println("\nAndelen kvinnor som spelar piano i genren jazz �r: " + sum / totalMusicians * 100 + "%");
		}
	    else {
    		printAllMusicians();
    		pressAnyKeyText();
	     }
	}
	
	public static void totalSalary() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				sum = sum + musician.getSalary();
			}
			System.out.println("\nAlla musikers totala l�n �r: " + sum);
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void averageSalary() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				sum = sum + musician.getSalary();				
			}
			System.out.println("\nMedelv�rdet p� alla musikers l�n �r: " + sum / totalMusicians);
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void highestSalary() {
		if(musicians.size() != 0) {
			int max = 0;
			for (int i = 1; i < musicians.size(); i++) {
				if (musicians.get(i).getSalary() > musicians.get(max).getSalary()) {
					max = i;
				}
			}
			System.out.println("\nDen h�gsta l�nen tillh�r: \n" + musicians.get(max));
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void lowestSalary() {
		if(musicians.size() != 0) {
		 	int min = 0;
			for (int i = 1; i < musicians.size(); i++) {
				if (musicians.get(i).getSalary() < musicians.get(min).getSalary()) {
					min = i;
				}
			}
			System.out.println("\nDen l�gsta l�nen tillh�r: \n" + musicians.get(min));
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void salaryAboveThirtyFiveThousandInPercent() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				if (musician.getSalary() > 35000) {
					sum++;
				}
			}
			System.out.println("\nAndelen musiker med l�n �ver 35000 �r: " + sum / totalMusicians * 100 + "%");
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void totalBonus() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				sum = sum + musician.getBonus();
			}
			System.out.println("\nAlla musikers totala bonus �r: " + sum);
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}

	public static void averageBonus() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				sum = sum + musician.getBonus();				
			}
			System.out.println("\nMedelv�rdet p� alla musikers bonus �r: " + sum / totalMusicians);
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void highestBonus() {
		if(musicians.size() != 0) {
			int max = 0;
			for (int i = 1; i < musicians.size(); i++) {
				if (musicians.get(i).getBonus() > musicians.get(max).getBonus()) {
					max = i;
				}
			}
			System.out.println("\nDen h�gsta bonusen tillh�r: \n" + musicians.get(max));
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void lowestBonus() {
		if(musicians.size() != 0) {
		 	int min = 0;
			for (int i = 1; i < musicians.size(); i++) {
				if (musicians.get(i).getBonus() < musicians.get(min).getBonus()) {
					min = i;
				}
			}
			System.out.println("\nDen l�gsta bonusen tillh�r: \n" + musicians.get(min));
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}
	
	public static void bonusBelowThreeThousandFiveHundredInPercent() {
		if(musicians.size() != 0) {
			double sum = 0;
			for (Musician musician : musicians) {
				if (musician.getBonus() < 3500) {
					sum++;
				}
			}
			System.out.println("\nAndelen musiker med bonus under 3500 �r: " + sum / totalMusicians * 100 + "%");
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}

}
