// Fig. 8.9: EmployeeTest.java
// Composition demonstration.

public class EmployeeTest {
   public static void main(String[] args) {
      Date birth = new Date(7, 24, 1949);
      Date hire = new Date(3, 12, 1988);
      
      //Address (house, street, city, zipcode)
      Address address = new Address(42, "50 Sander Dr.", "Camelot", "V4M2J3");
      
      Employee employee = new Employee("Bob", "Blue", birth, hire, address);

      System.out.println(employee);
      
      // 1. update month in hiredate for the employee (month, day, year)
      // 2. print the employee data
      System.out.println("\n1---------Update month--------------");
      hire.setMonth(5);
      System.out.println(employee);
      
      // 3. update street name in the address of employee
      // 4. print employee data
      System.out.println("\n2---------Update Street-------------");
      address.setStreet("Baker Fields Street");  
      System.out.println(employee);
      
      // 5. print only the hiredate of employee
      System.out.println("\n3--------Print only HireDate--------");
      System.out.println("Hiredate: " + employee.getHireDate());
      
      // 6. print address of employee
      System.out.println("\n4--------Print only address--------");
      System.out.println(address);
      
      // 7. update the last name of employee to Carlos
      // 8. print first name and last name of the employee
      employee.setLastName("Carlos");
      System.out.println("\n5--------Update Last Name----------"
      		+ "\n---and Print First and Last Name---");
      System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
      
      // 9. update date in hire
      // 10 print the hiredate
      System.out.println("\n6--------Update Hiredate-----------");
      hire.setDate(11, 17, 1999);
      System.out.println("Hiredate: " + employee.getHireDate());
      
      // 11. update year of hiredate
      // 12. print the updated date
      System.out.println("\n7-------Update Hiredate Year--------");
      hire.setYear(2018);
      System.out.println("Hiredate: " + employee.getHireDate());
      
      // 13. update city to Toronto
      System.out.println("\n8----------Update City-----------");
      address.setCity("Toronto");
      System.out.println(employee);
   } 
} 
