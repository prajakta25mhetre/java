public class Methoddemo {
    int a = 20 ; //non static field which is also know as instance variable
    static int b = 10; // static field

    //non static 
    void display(){
        System.out.println("non static field");
        System.out.println(a + " " + b); //both the varialble is accessible in non static method
    }

    //static method
   static void show(){
        System.out.println("static method");// static method access only static attribute.
    }
    
    public static void main(String[] args) {
        Methoddemo md = new Methoddemo(); //md-object reference/ object name
        System.out.println(md.a );  
        System.out.println(Methoddemo.b);
        md.display();
        Methoddemo.show();
    }
}
