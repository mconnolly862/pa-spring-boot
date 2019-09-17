package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	/**
	 * @author CON19171859
	 *
	 *         public static void main(String[] args) { // TODO Auto-generated
	 *         method stub ArrayList<String> dwarfs = new ArrayList<String>();
	 *         dwarfs.add("Happy"); dwarfs.add("Sleepy"); dwarfs.add("Dopey");
	 *         dwarfs.add("Bashful"); dwarfs.add("Sneezy"); dwarfs.add("Grumpy");
	 *         dwarfs.add("Doc"); System.out.println(" "+ " \nThe seven dwarfs are
	 *         \n "); for (String dwarf: dwarfs) { System.out.print(" " + dwarf + "
	 *         "); } ArrayList<String> dwarves = new ArrayList<String>();
	 *         dwarves.add("Thorin"); dwarves.add("Balin"); dwarves.add("Dwalin");
	 *         dwarves.add("fili"); dwarves.add("Kili"); dwarves.add("Dori");
	 *         dwarves.add("Nori"); dwarves.add("Oin"); dwarves.add("Ori");
	 *         dwarves.add("Gloin"); dwarves.add("Bifur"); dwarves.add("Bofur");
	 *         dwarves.add("Bombur"); System.out.println("The 13 dwarves are \n");
	 * 
	 *         for (String dwarve: dwarves) { System.out.print(" " + dwarve + " ");
	 *         }
	 * 
	 *         }
	 * @param  
	 */

	public static void main(String[] args) {

		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf happy = new Dwarf();
		happy.setName("happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		
		//-----------etc
		
		Dwarf thorin = new Dwarf();
		thorin.setName("thorin");
		thorin.setAuthor("Tolken");
		dwarfs.add(thorin);
		Dwarf Balin = new Dwarf();
		Balin.setName("Balin");
		Balin.setAuthor("Tolken");
		dwarfs.add(Balin);

		System.out.println(" The disney Dwarfs are :\n");
		
		
		
		
		//-------------	
		for (Dwarf dwarf:dwarfs) {
			if(dwarf.getAuthor() == "Disney") {
			System.out.print(" " + dwarf.getName()+ " ");
			System.out.println("\n");}
	
		}
		
System.out.println(" The tolken Dwarfs are :\n");
		
		
		
		
		//-------------	
		for (Dwarf dwarf:dwarfs) {
			if(dwarf.getAuthor() == "Tolken") {
			System.out.print(" " + dwarf.getName()+ " ");}
	
		}
		

		
		}
	}
	

