package ca.ciccc.java.asami.model;

/**
 * Lab4 GasStationAttendant class
 * 
 * @author tanii_asami
 *
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {

	private double numberOfDollarsStolenPerDay;

	/**
	 * GasStationAttendant Constructor
	 * 
	 * @param name
	 *            to be set
	 * @param numberOfDollarsStolenPerDay
	 *            to be set
	 */
	public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
		super(name);
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.UNIFORM;
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
		return "pump";
	}

	@Override
	public double getOverTimePayRate() {
		return 1.5;
	}

	/**
	 * HockeyPlayers with the most goals are considered "highest"
	 */
	public int compareTo(GasStationAttendant gasStationAttendant) {
		return Double.compare(gasStationAttendant.numberOfDollarsStolenPerDay, numberOfDollarsStolenPerDay);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		GasStationAttendant that = (GasStationAttendant) obj;
		if (this.numberOfDollarsStolenPerDay != that.numberOfDollarsStolenPerDay) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "GasStationAttendant [numberOfDollarsStolenPerDay=" + numberOfDollarsStolenPerDay + ", getName()="
				+ getName() + "]";
	}
}
