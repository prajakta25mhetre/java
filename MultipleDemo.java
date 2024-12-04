interface I1{
  public void demo();
}
interface I2{
  public void demo();
}

//multiple inheritance
class A implements I1,I2{
  @Override
  public void demo(){
    System.out.println("this is from class A");
  }
}



public class MultipleDemo {
  public static void main(String[] args) {
    A a = new A();
    a.demo();

  }
  
}
