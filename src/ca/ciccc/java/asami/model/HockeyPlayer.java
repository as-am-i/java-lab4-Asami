package ca.ciccc.java.asami.model;

/**
 * Lab4 HockeyPlayer class
 * 
 * @author tanii_asami
 *
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {

	private int numberOfGoals;

	/**
	 * HockeyPlayer Constructor
	 * 
	 * @param name
	 *            to be set
	 * @param numberOfGoals
	 *            to be set
	 */
	public HockeyPlayer(String name, int numberOfGoals) {
		// the constructor always must be the first thing after attributes
		// all attributes from the super class and in the current class must be
		// initialized
		super(name);
		this.numberOfGoals = numberOfGoals;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.JERSEY;
	}

	@Override
	public boolean isPaidSalary() {
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	@Override
	public String getWorkVerb() {
		return "play";
	}

	@Override
	public double getOverTimePayRate() {
		return 0.0;
	}

	/**
	 * Professors who teach Computer Science are considered "highest"; others are
	 * equal
	 */
	public int compareTo(HockeyPlayer hockeyPlayer) {
		return hockeyPlayer.numberOfGoals - this.numberOfGoals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfGoals;
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
		HockeyPlayer that = (HockeyPlayer) obj;
		if (this.numberOfGoals != that.numberOfGoals) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "HockeyPlayer [numberOfGoals=" + numberOfGoals + ", getName()=" + getName() + "]";
	}

}
