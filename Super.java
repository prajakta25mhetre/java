class A {
    String name ="praj";
}
class B extends A {
    String name="khushbu";
    void show(){
        
        System.out.println("name="+ name);
        System.out.println("name="+ super.name);
    }
}

public class Super {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
//------------------------------***************incomplete------------------------------