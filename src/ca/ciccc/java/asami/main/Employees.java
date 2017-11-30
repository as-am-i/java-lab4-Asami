package ca.ciccc.java.asami.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ca.ciccc.java.asami.model.Employee;
import ca.ciccc.java.asami.model.GasStationAttendant;
import ca.ciccc.java.asami.model.HockeyPlayer;
import ca.ciccc.java.asami.model.Parent;
import ca.ciccc.java.asami.model.Professor;

/**
 * Lab4 Employees class
 * 
 * @author tanii_asami
 *
 */
public class Employees {
	private ArrayList<Employee> employees;

	private ArrayList<HockeyPlayer> hockeyPlayers;
	private ArrayList<Professor> professors;
	private ArrayList<Parent> parents;
	private ArrayList<GasStationAttendant> gasStationAttendants;

	/**
	 * Employees Constructor
	 */
	public Employees() {
		initializeEmployees();

		initializeHockeyPlayers();
		initializeProfessors();
		initializeParents();
		initializeGasStationAttendants();
	}

	/**
	 * create an ArrayList of 20 Employee references to initialize
	 */
	public void initializeEmployees() {
		// create a list of employees
		employees = new ArrayList<>();
		employees.add(new HockeyPlayer("Wayne Gretzky", 894));
		employees.add(new HockeyPlayer("Who Ever", 0));
		employees.add(new HockeyPlayer("Brent Gretzky", 1));
		employees.add(new HockeyPlayer("Pavel Bure", 437));
		employees.add(new HockeyPlayer("Jason Bourne", 0));

		employees.add(new Professor("Albert Einstein", "Physics"));
		employees.add(new Professor("Alan Turing", "Computer Systems"));
		employees.add(new Professor("Richard Feynman", "Physics"));
		employees.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		employees.add(new Professor("Kurt Godel", "Logic"));

		employees.add(new Parent("Tiger Woods", 1));
		employees.add(new Parent("Super Mom", 168));
		employees.add(new Parent("Lazy Larry", 20));
		employees.add(new Parent("Ex Hausted", 168));
		employees.add(new Parent("Super Dad", 167));

		employees.add(new GasStationAttendant("Joe Smith", 10));
		employees.add(new GasStationAttendant("Tony Baloney", 100));
		employees.add(new GasStationAttendant("Benjamin Franklin", 100));
		employees.add(new GasStationAttendant("Mary Fairy", 101));
		employees.add(new GasStationAttendant("Bee See", 1));
	}

	/**
	 * create a separate ArrayList for HockeyPlayers class to initialize
	 */
	public void initializeHockeyPlayers() {
		// create a list of HockeyPlayers
		hockeyPlayers = new ArrayList<>();
		hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
		hockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
		hockeyPlayers.add(new HockeyPlayer("Brent Gretzky", 1));
		hockeyPlayers.add(new HockeyPlayer("Pavel Bure", 437));
		hockeyPlayers.add(new HockeyPlayer("Jason Bourne", 0));
	}

	/**
	 * create a separate ArrayList for Professors class to initialize
	 */
	public void initializeProfessors() {
		professors = new ArrayList<>();
		professors.add(new Professor("Albert Einstein", "Physics"));
		professors.add(new Professor("Alan Turing", "Computer Systems"));
		professors.add(new Professor("Richard Feynman", "Physics"));
		professors.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		professors.add(new Professor("Kurt Godel", "Logic"));
	}

	/**
	 * create a separate ArrayList for Parents class to initialize
	 */
	public void initializeParents() {
		parents = new ArrayList<>();
		parents.add(new Parent("Tiger Woods", 1));
		parents.add(new Parent("Super Mom", 168));
		parents.add(new Parent("Lazy Larry", 20));
		parents.add(new Parent("Ex Hausted", 168));
		parents.add(new Parent("Super Dad", 167));
	}

	/**
	 * create a separate ArrayList for GasStationAttendants class to initialize
	 */
	public void initializeGasStationAttendants() {
		gasStationAttendants = new ArrayList<>();
		gasStationAttendants.add(new GasStationAttendant("Joe Smith", 10));
		gasStationAttendants.add(new GasStationAttendant("Tony Baloney", 100));
		gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 100));
		gasStationAttendants.add(new GasStationAttendant("Mary Fairy", 101));
		gasStationAttendants.add(new GasStationAttendant("Bee See", 1));
	}

	/**
	 * print HockeyPlayers
	 * 
	 * @param hockeyPlayers
	 *            to be printed
	 */
	public void printHockeyPlayers(List<HockeyPlayer> hockeyPlayers) {
		for (HockeyPlayer hockeyPlayer : hockeyPlayers) {
			System.out.println(hockeyPlayer);
		}
	}

	/**
	 * print Professors
	 * 
	 * @param professors
	 *            to be printed
	 */
	public void printProfessors(List<Professor> professors) {
		for (Professor professor : professors) {
			System.out.println(professor);
		}
	}

	/**
	 * print Parents
	 * 
	 * @param parents
	 *            to be printed
	 */
	public void printParents(List<Parent> parents) {
		for (Parent parent : parents) {
			System.out.println(parent);
		}
	}

	/**
	 * print GasStationAttendants
	 * 
	 * @param gasStationAttendants
	 *            to be printed
	 */
	public void printGasStationAttendants(List<GasStationAttendant> gasStationAttendants) {
		for (GasStationAttendant gasStationAttendant : gasStationAttendants) {
			System.out.println(gasStationAttendant);
		}
	}

	/**
	 * print String to make clear if it's before or after sorting
	 * 
	 * @param string
	 *            to show if before or after
	 */
	public void printBeforeAndAfter(String string) {
		if (string.equals("Before")) {
			System.out.println("\n --- Before Sort ---");
		} else {
			System.out.println("\n --- After Sort ---");
		}
	}

	/**
	 * call helper methods to print out four Employees collections before and after
	 * sorting
	 */
	public void run() {
		// HockeyPlayers
		printBeforeAndAfter("Before");
		printHockeyPlayers(hockeyPlayers);
		Collections.sort(hockeyPlayers);
		printBeforeAndAfter("After");
		printHockeyPlayers(hockeyPlayers);

		// Professors
		printBeforeAndAfter("Before");
		printProfessors(professors);
		Collections.sort(professors);
		printBeforeAndAfter("After");
		printProfessors(professors);

		// Parents
		printBeforeAndAfter("Before");
		printParents(parents);
		Collections.sort(parents);
		printBeforeAndAfter("After");
		printParents(parents);

		// GasStationAttendant
		printBeforeAndAfter("Before");
		printGasStationAttendants(gasStationAttendants);
		Collections.sort(gasStationAttendants);
		printBeforeAndAfter("After");
		printGasStationAttendants(gasStationAttendants);
	}

	/**
	 * display all objects that are equal to one another
	 */
	public void displayAllObjects() {
		ArrayList<Employee> sameEmployees;
		sameEmployees = new ArrayList<>();

		for (int index1 = 0; index1 < employees.size(); index1++) {
			Employee emp = employees.get(index1);

			for (int index2 = index1 + 1; index2 < employees.size(); index2++) {
				Employee other = employees.get(index2);

				if (emp.equals(other)) {
					sameEmployees.add(emp);
					sameEmployees.add(other);
				}
			}
		}

		for (Employee sameEmployee : sameEmployees) {
			System.out.println(sameEmployee);
		}
	}

	public static void main(String[] args) {
		// in static method, we can use only static attributes and methods
		// we cannot access the non-static attributes like hockeyPlayers to print them
		// so we need to move these into the non-static method run() and create an
		// object from Employees to call the method in main method
		Employees employees1 = new Employees();

		System.out.println("--- Print out four Employees collections before and after sorting ---");
		employees1.run();

		System.out.println();

		System.out.println("--- Display all objects that are equal to one another ---");
		employees1.displayAllObjects();
	}
}
