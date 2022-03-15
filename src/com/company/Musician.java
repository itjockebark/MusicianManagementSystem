package com.company;

public abstract class Musician {	
		
		private int id;
		private String instrument;
		private String genre;
		private String firstName;
		private String lastName;
		private String gender;
		private double salary;
		private double bonus;
		
		static int idGenerator;
		static int totalMusicians;

		
		public Musician(String instrument, String genre, String firstName, String lastName, String gender, double salary, double bonus) {
			id = ++idGenerator;
			totalMusicians++;
			
			this.instrument = instrument;
			this.genre = genre;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.salary = salary;
			this.bonus = bonus;
		}
				
		public int getId() {
			return id;
		}
	
		public String getInstrument() {
			return instrument;
		}

		public String getGenre() {
			return genre;
		}
		
		public void setGenre(String genre) {			
			this.genre = genre;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getGender() {
			return gender;
		}
		
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public double getBonus() {
				if(getGender().equalsIgnoreCase("kvinna")) {
					return 1.5*bonus;
				}
				else {
					return bonus;
				}
		}
		
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		
		public abstract void printInformation();
		
		@Override
		public String toString() {
			return ""+ 
					"\nID: " + id + 
					"\nIntrument: " + instrument +
					"\nGenre: " + genre +
					"\nFörnamn: " + firstName + 
					"\nEfternamn: " + lastName + 
					"\nKön: " + gender + 
					"\nLön: " + salary + 
					"\nBonus: " + getBonus();
		}
		
}
