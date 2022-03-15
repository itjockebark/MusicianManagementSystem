package com.company;

import static com.company.UI.*;
import static com.company.Utilities.*;
import static com.company.CreateManagement.*;
import static com.company.RemoveManagement.*;
import static com.company.UpdateManagement.*;
import static com.company.SearchManagement.*;
import static com.company.StatisticManagement.*;

public class ProgramManagement {
	
	public static void mainProgram() {
		int choice = mainMenu();
		switch(choice) {
		case 1 -> managementProgram();

		case 2 -> statisticProgram();
			
		case 0 -> {loopProgram = false; 
		System.out.println("\nProgrammet är nu avslutat!");}
		
		default -> wrongInputText();
		}
	}
	
	public static void managementProgram() {
		int choice = managementMenu();
		switch(choice) {
		case 1 -> createProgram();
			
		case 2 -> removeProgram();
			
		case 3 -> updateProgram();
			
		case 4 -> searchProgram();
			
		case 5 -> printAllMusicians();
					
		case 0 -> {}
					
		default -> wrongInputText();			
		}
	}
	
	public static void createProgram() {
		int choice = createMenu();
		switch(choice) {
		case 1 -> createMusician();
			
		case 2 -> createFakeMusicians();
			
		case 0 -> {}
			
		default -> wrongInputText();			
		}
	}
	
	public static void removeProgram() {
		int choice = removeMenu();
		switch(choice) {
		case 1 -> removeById();
			
		case 2 -> removeByFirstName();
			
		case 3 -> removeByLastName();
			
		case 4 -> removeByGender();
			
		case 5 -> removeByInstrument();
		
		case 6 -> removeByGenre();
		
		case 7 -> removeBySalary();
					
		case 8 -> removeByBonus();
		
		case 0 -> {}
					
		default -> wrongInputText();			
		}
	}
	
	public static void updateProgram() {
		int choice = updateMenu();
		switch(choice) {
		case 1 -> updateFirstName();
			
		case 2 -> updateLastName();
		
		case 3 -> updateGender();
			
		case 4 -> updateGenre();
			
		case 5 -> updateSalary();
			
		case 0 -> {}
			
		default ->wrongInputText();
		}
	}
	
	public static void searchProgram() {
		int choice = searchMenu();
		switch(choice) {
		case 1 -> searchById();
			
		case 2 -> searchByFirstName();
			
		case 3 -> searchByLastName();
			
		case 4 -> searchByGender();
			
		case 5 -> searchByInstrument();
		
		case 6 -> searchByGenre();
			
		case 7 -> searchBySalary();
			
		case 8 -> searchByBonus();
			
		case 0 -> {}
			
		default -> wrongInputText();

		}
	}
	
	public static void statisticProgram() {
		int choice = statisticMenu();
		switch(choice) {
		case 1 -> musicianStatisticProgram();
			
		case 2 -> salaryStatisticProgram();
			
		case 3 -> bonusStatisticProgram();
		
		case 0 -> {}
			
		default -> wrongInputText();

		}
	}
	
	public static void musicianStatisticProgram() {
		int choice = musicianStatisticMenu();
		switch(choice) {
		case 1 -> totalMusicians();
			
		case 2 -> womenInPercent();
		
		case 3 -> guitaristsInPercent();
		
		case 4 -> menPlayingRockInPercent();
		
		case 5 -> womenPlayingPianoJazzInPercent();
			
		case 0 -> {}
			
		default -> wrongInputText();

		}
	}
	
	public static void salaryStatisticProgram() {
		int choice = salaryStatisticMenu();
		switch(choice) {
		case 1 -> totalSalary();
		
		case 2 -> averageSalary();
			
		case 3 -> highestSalary();
			
		case 4 -> lowestSalary();
		
		case 5 -> salaryAboveThirtyFiveThousandInPercent();
			
		case 0 -> {}
			
		default -> wrongInputText();

		}
	}
	
	public static void bonusStatisticProgram() {
		int choice = bonusStatisticMenu();
		switch(choice) {
		case 1 -> totalBonus();
		
		case 2 -> averageBonus();
			
		case 3 -> highestBonus();
			
		case 4 -> lowestBonus();
		
		case 5 -> bonusBelowThreeThousandFiveHundredInPercent();
			
		case 0 -> {}
			
		default -> wrongInputText();

		}
	}

}

