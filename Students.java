class A{
    int rollno = 10;
    String name = "Prajakta";

    void display(){
        System.out.println("display method");
    }
}
class B extends A{
    int rollno;
    String name;
    void show(){
        System.out.println("show method");
        System.out.println("rollno: " + this.rollno);
        System.out.println("name: " + this.name);

    }

}

public class Students {
    B ab = new B();
   // ab.display();
   // ab.show();
}

