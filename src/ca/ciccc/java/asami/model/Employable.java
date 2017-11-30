package ca.ciccc.java.asami.model;

/**
 * Lab4 interface Employable
 * 
 * @author tanii_asami
 *
 */
public interface Employable {

	/**
	 * 
	 * @return DressCode to get
	 */
	public DressCode getDressCode();

	/**
	 * 
	 * @return if it is paid salary
	 */
	public boolean isPaidSalary();

	/**
	 * 
	 * @return post Secondary Education Required
	 */
	public boolean postSecondaryEducationRequired();

	/**
	 * 
	 * @return Work Verb to get
	 */
	public String getWorkVerb();

}
