public class Employee{
    //data members
    int empId;
    String name;
    int salary;
   
    //default constructor
    Employee(){

    }

     Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
     }
     Employee(int empId, int salary){
        this.empId = empId;
        this.salary = salary;
     }
    public static void main(String[] args){
        Employee emp = new Employee(1,"John", 20000);
        System.out.println(emp.empId);
        System.out.println(emp.name);
        System.out.println(emp.salary);
        Employee emp1 = new Employee(1,500000);
        System.out.println(emp1.empId);
        System.out.println(emp1.salary);


    }
}