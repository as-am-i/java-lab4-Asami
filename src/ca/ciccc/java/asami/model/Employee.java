package ca.ciccc.java.asami.model;

/**
 * Lab4 Employee class as abstract
 * 
 * @author tanii_asami
 *
 */
public abstract class Employee implements Employable {

	private String name;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            to be set
	 */
	public Employee(String name) {
		setName(name);
	}

	/**
	 * 
	 * @return Over TIme Pay Rate to get
	 */
	public abstract double getOverTimePayRate();

	/**
	 * 
	 * @return name to get
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            to be set
	 */
	public final void setName(String name) {
		this.name = name;
	}

}
