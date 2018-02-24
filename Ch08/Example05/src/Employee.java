// Fig. 8.8: Employee.java
// Employee class with references to other objects.

public class Employee {
   private String firstName;
   private String lastName;
   private Date birthDate;
   private Date hireDate; 
   
   // Address
   private Address Address;
   // constructor to initialize name, birth date and hire date
   public Employee(String firstName, String lastName, Date birthDate, 
      Date hireDate, Address Address) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthDate = birthDate;
      this.hireDate = hireDate;
      this.Address = Address;
   } 
   
   // Employee emp = new Employee("ABC", "XYZ");
   /*
    * public Employee(String firstName, String lastName)
    * {
    * 	//this.firstName = firstName;
    * 	//this.lastName = lastName;
    * 	this(firstName, lastName, null, null);
    */
   

	
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
   	public String getFirstName() {
	return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public Date getHireDate() {
		return hireDate;
	}

// convert Employee to String format
   public String toString() {
	   // added the Address here
      return String.format("%s, %s  Hired: %s  Birthday: %s \n Address: %s", 
         lastName, firstName, hireDate, birthDate, Address);
   } 
} 

