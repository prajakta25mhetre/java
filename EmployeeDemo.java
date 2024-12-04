//static and non static

class Employee{
    int id;
    String name;
Employee(){
    this.id= id;
    this.name= name;
}

Employee(int id, String name){
    this.id= id;
    this.name= name;
}

void displayemployeedetails(){
    System.out.println("non static method");
}

static void showEmployeedetails(){
    System.out.println("static method");
}

}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayemployeedetails();//static
        Employee.showEmployeedetails();//non static method
    }
}
