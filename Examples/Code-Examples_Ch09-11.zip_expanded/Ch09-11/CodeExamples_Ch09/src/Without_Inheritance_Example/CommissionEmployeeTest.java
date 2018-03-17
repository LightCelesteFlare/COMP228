// Fig. 9.5: CommissionEmployeeTest.java
// CommissionEmployee class test program.
package Without_Inheritance_Example;
public class CommissionEmployeeTest {
   public static void main(String[] args) {
      // instantiate CommissionEmployee object
      CommissionEmployee employee = new CommissionEmployee(
         "Sue", "Jones", "222-22-2222", 10000, .06);       
      
      // get commission employee data
      System.out.println("Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());

      employee.setGrossSales(5000);  
      employee.setCommissionRate(.1);
      
      System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", employee);
      // 
   // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee2 =             
         new BasePlusCommissionEmployee(                
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      // get base-salaried commission employee data
      System.out.printf(
         "Employee information obtained by get methods:%n");
      System.out.printf("%s %s%n", "First name is",
         employee2.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee2.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee2.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee2.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee2.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee2.getBaseSalary());

      employee2.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
          employee2.toString());
   } // end main()
} // end class


