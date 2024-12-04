//5.Using ‘this’ keyword to invoke(call) the current class method

class Test3{
    int a;
    int b;

void display(){
    System.out.println(this.a);
    System.out.println(this.b);
}
void show(){
    this.display();
}
}


public class This {
    public static void main(String[] args) {
    Test3 t = new Test3();
    t.show();
}
    
}
