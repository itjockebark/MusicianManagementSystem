package com.company;

public class Pianist extends Musician {
	
	private String pianoType;
	
	public Pianist(String instrument, String genre, String firstName, String lastName, String gender, double salary, String pianoType) {
		super(instrument, genre, firstName, lastName, gender, salary, 2500);
		this.pianoType = pianoType;
	}
	
	public String getPianoType() {
		return pianoType;
	}

	public void setPianoType(String pianoType) {
		this.pianoType = pianoType;
	}

	public void printInformation() {
		if(pianoType.equalsIgnoreCase("flygel")) {
			System.out.println("""
				    \nFlygeln är pianot som är mest förekommande på stora scener som på
					på konserter och teatrar! """);
		}
		else if(pianoType.equalsIgnoreCase("klassiskt")) {
			System.out.println("""
	               \nDet klassiska pianot brukar finnas på skolor, i musikaliska uterum, 
	               i replokaler, danshallar osv!""");
		}
		else if(pianoType.equalsIgnoreCase("elektroniskt")) {
			System.out.println("""
					\nDet elektoniska pianot används framförallt inom genrerna rock 
					och jazz!""");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
			   "\nTyp av piano: " + pianoType;
	}	
	
}
