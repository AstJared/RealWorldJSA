package edu.saintjoe.cs.brianc.realworld;

public class Student {
	private String name;
	private String gender;
	private int classYr;
	private int age;
	private String haircolor;
// I had no idea what else students need to keep track of.
	
	
	/* Data members above, methods below */
	
	// Right now a "full data" constructor only
	public Student(String newName, String newGender, int newClassYr, int newAge, String newHaircolor) {
		name = newName;
		gender = newGender;
		classYr = newClassYr;
		age = newAge;
		haircolor = newHaircolor;
	}
	
	// Accessors and Mutators for the data members
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	public int getAge() {
		return age;
	}
	public void setHaircolor (String newHaircolor) {
		haircolor = newHaircolor;
	}
	public String getHaircolor() {
		return haircolor;
	}
	public void setGender(String newGender) {
		gender = newGender;
	}
	public String getGender() {
		return gender;
	}

	public void setClassYr(int year) {
		classYr = year;
	}
	public int getClassYr() {
		return classYr;
	}
	
	public String toString() {
		return ("Student: " + name + " Gender: " + gender + " Class Year: " + classYr + " Age: " + age + " Hair Color: " + haircolor);
	}
	
	
}
