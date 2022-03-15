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
			System.out.println("\nAndelen musiker som är gitarrister: " + sum / totalMusicians * 100 + "%");		
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
			System.out.println("\nAndelen kvinnor som är musiker: " + sum / totalMusicians * 100 + "%");
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
			System.out.println("\nAndelen män som spelar genren rock är: " + sum / totalMusicians * 100 + "%");		
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
			System.out.println("\nAndelen kvinnor som spelar piano i genren jazz är: " + sum / totalMusicians * 100 + "%");
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
			System.out.println("\nAlla musikers totala lön är: " + sum);
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
			System.out.println("\nMedelvärdet på alla musikers lön är: " + sum / totalMusicians);
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
			System.out.println("\nDen högsta lönen tillhör: \n" + musicians.get(max));
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
			System.out.println("\nDen lägsta lönen tillhör: \n" + musicians.get(min));
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
			System.out.println("\nAndelen musiker med lön över 35000 är: " + sum / totalMusicians * 100 + "%");
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
			System.out.println("\nAlla musikers totala bonus är: " + sum);
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
			System.out.println("\nMedelvärdet på alla musikers bonus är: " + sum / totalMusicians);
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
			System.out.println("\nDen högsta bonusen tillhör: \n" + musicians.get(max));
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
			System.out.println("\nDen lägsta bonusen tillhör: \n" + musicians.get(min));
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
			System.out.println("\nAndelen musiker med bonus under 3500 är: " + sum / totalMusicians * 100 + "%");
		}
		else {
    		printAllMusicians();
    		pressAnyKeyText();
		}
	}

}
