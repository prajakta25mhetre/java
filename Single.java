//single level inheritance


class A{
    int a;
    A(){
        System.out.println("base class constructor");
    }
    A(int a){
        this.a = a;
    }
}

class B extends  A{
    int b;
    B(){
        System.out.println("child class constructor");
    }
    B(int a, int b){
        super(a);
        this.b = b;
    }
    void display(){
        System.out.println("a: " + a + " b: " + b);
    }

}

public class Single {
    public static void main(String[] args){
        B child = new B(10, 20); //by creating only object both the constructor get called
        child.display();
    }
    
}
