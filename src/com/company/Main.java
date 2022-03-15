package com.company;

import static com.company.UI.displayWelcome;
import static com.company.ProgramManagement.mainProgram;
import static com.company.Utilities.loopProgram;
public class Main {

	public static void main(String[] args) {
		displayWelcome();	
		while(loopProgram) {
		mainProgram();
		}
	}

}
