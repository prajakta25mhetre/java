class Employee{
  String name;
  int empId;
  Employee(String name, int empId){
    this.name = name;
    this.empId = empId;
  }

  public abstract double calculateSalary();

  public void printDetails(){
    System.out.println("Employee name: " + name);
    System.out.println("Employee empId: " + empId);
  }
}

class FulltimeEmployee extends Employee {
  double monthlys
}

public class Main {
  public static void main(String[] args) {
    
  }
  
}
