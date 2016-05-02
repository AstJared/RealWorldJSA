package edu.saintjoe.cs.brianc.realworld;

public class GameCollection {

	public GameCollection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}	
			private String name;
			private String rating; 
			
			
		public GameCollection (String newName, String newRating) {
			name = newName;
			rating = newRating; 
			}
	
		public void setName(String newName) {
			name = newName; }
		
		public String getName() {
			return name; 
		}
		public void setRating(String newRating) { 
			rating = newRating; }
		
		public String getRating() {
			return rating;
	}
		public String toString() {
			return ("GameCollection: " + name + " Rating: " + rating);
		}
}
