package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
// array list is added , its being constructed in the Dwarf.java class

		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		dwarfs.add(new Dwarf("Sleepy", "disney"));
		dwarfs.add(new Dwarf("Happy", "disney"));
		dwarfs.add(new Dwarf("Grumpy", "disney"));
		dwarfs.add(new Dwarf("Dopey", "disney"));
		dwarfs.add(new Dwarf("Bashful", "disney"));
		dwarfs.add(new Dwarf("Doc", "disney"));
		dwarfs.add(new Dwarf("Sneezy", "disney"));

		dwarfs.add(new Dwarf("Thorin", "tolken"));
		dwarfs.add(new Dwarf("Balin", "tolken"));
		dwarfs.add(new Dwarf("Borfu", "tolken"));
		dwarfs.add(new Dwarf("Dwalin", "tolken"));
		dwarfs.add(new Dwarf("fifi", "tolken"));

//		the tolken dwarfs get printed out here from the array list

		System.out.println("The tolken Dwarfs are:\n");

		for (Dwarf dwarf : dwarfs) {
			if (dwarf.getAuthor() == "tolken") {
				System.out.print(" " + dwarf.getName() + " ");
			}
		}
//		the Disney dwarfs get printed  out here  from the array list
		
		System.out.println("\n");

		System.out.println("The disney Dwarfs are:\n");

		for (Dwarf dwarf : dwarfs) {
			if (dwarf.getAuthor() == "disney") {
				System.out.print(" " + dwarf.getName() + " ");
			}
		}

//END OF main method 
	}
// END OF CLASS
}
