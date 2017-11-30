package ca.ciccc.java.asami.model;

/**
 * Lab4 Professor class
 * 
 * @author tanii_asami
 *
 */
public class Professor extends Employee implements Comparable<Professor> {

	private String teachingMajor;

	/**
	 * Professor Constructor
	 * 
	 * @param name
	 *            to be set
	 * @param teachingMajor
	 *            to be set
	 */
	public Professor(String name, String teachingMajor) {
		super(name);
		this.teachingMajor = teachingMajor;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.FANCY;
	}

	@Override
	public boolean isPaidSalary() {
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return true;
	}

	@Override
	public String getWorkVerb() {
		return "teach";
	}

	@Override
	public double getOverTimePayRate() {
		return 2.0;
	}

	/**
	 * GasStationAttendants who steal the most per week are considered "highest"
	 */
	public int compareTo(Professor professor) {
		// String
		return this.teachingMajor.compareTo(professor.teachingMajor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		// cast
		Professor that = (Professor) obj;
		if (this.teachingMajor != that.teachingMajor) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Professor [teachingMajor=" + teachingMajor + ", getName()=" + getName() + "]";
	}

}
