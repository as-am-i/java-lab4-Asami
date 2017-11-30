package ca.ciccc.java.asami.model;

/**
 * Lab4 Parent class
 * 
 * @author tanii_asami
 *
 */
public class Parent extends Employee implements Comparable<Parent> {
	private int numberOfHoursSpentPerWeekWithKids;

	/**
	 * Parent Constructor
	 * 
	 * @param name
	 *            to be set
	 * @param numberOfHoursSpentPerWeekWithKids
	 *            to be set
	 */
	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
		super(name);
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.ANYTHING;
	}

	@Override
	public boolean isPaidSalary() {
		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	@Override
	public String getWorkVerb() {
		return "care";
	}

	@Override
	public double getOverTimePayRate() {
		return -2.0;
	}

	/**
	 * Parents who spend the most hours/week with their kids are considered
	 * "highest"
	 */
	public int compareTo(Parent parent) {
		return parent.numberOfHoursSpentPerWeekWithKids - this.numberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
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
		Parent that = (Parent) obj;
		if (this.numberOfHoursSpentPerWeekWithKids != that.numberOfHoursSpentPerWeekWithKids) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Parent [numberOfHoursSpentPerWeekWithKids=" + numberOfHoursSpentPerWeekWithKids + ", getName()="
				+ getName() + "]";
	}

}
