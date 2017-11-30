package ca.ciccc.java.asami.model;

/**
 * Lab4 DressCode class as Enumeration with 4 values
 * 
 * @author tanii_asami
 *
 */
public enum DressCode {
	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

	private String description;

	/**
	 * DressCode constructor
	 * 
	 * @param description
	 *            to be set
	 */
	private DressCode(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
}
