//if the class is abstarct then we cannot make the obj of that class.

abstract class Employee{
  int empId;
  String name;

  public abstract void display();

  public void show(){
    System.out.println("this is non static method");
  }

  // Employee(int empId, String name){
  //   this.empId = empId;
  //   this.name = name;
  // }
} 
class Teacher extends Employee{
  @Override
  public void display(){
    System.out.println("this is teacher class");
  }
}

public class AbstractDemo {
  public static void main(String[]args){
      Teacher t = new Teacher();
      t.display();
      t.show();

  }
  
}
