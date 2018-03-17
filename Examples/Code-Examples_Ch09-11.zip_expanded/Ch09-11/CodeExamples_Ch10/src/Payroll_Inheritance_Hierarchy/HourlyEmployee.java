package Payroll_Inheritance_Hierarchy;

public class HourlyEmployee extends Employee{
	
	private double Hoursworked;
	private double Rate;
	
	public double getHoursworked() {
		return Hoursworked;
	}
	
	public void setHoursworked(double hoursworked) {
		if (hoursworked >= 0.0)
		{
			throw new IllegalArgumentException("Hours need to be >= 0.0");
		}
		
		this.Hoursworked = hoursworked;
	}
	
	public double getRate() {
		return Rate;
	}
	public void setRate(double commissionrate) {
		if (commissionrate <= 0.0)
		{
			throw new IllegalArgumentException("Rate must be > 0.0 and < 1.0");
		}
		
		this.Rate = commissionrate;
	}
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double sethours, double setrate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (sethours <= 0.0)
		{
			throw new IllegalArgumentException("Hoursworked rate must be > 0.0");
		}
		
		if (sethours < 0.0)
		{
			throw new IllegalArgumentException("HourlyRate must be > 0.0");
		}
		setRate(setrate);
		setHoursworked(sethours);
	}
	
	@Override
	public double earnings() {
		if(getHoursworked() <= 40)
			return getRate() * getHoursworked();
		else
			return (40 * getRate() + ((getHoursworked() - 40) * (getRate() * 1.5))); // note: always 1.5 for Canada law
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f", 
				"Employee", super.toString(), // super is getting from the parent class
				"Hourly Rate", getRate(),
				"Hourly Worked", getHoursworked());
	}

}
