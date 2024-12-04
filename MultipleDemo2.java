//diamond problem
interface I1{
  public default void demo(){
    System.out.println("this is i1");
  }
}
interface I2{
  public default void demo(){
    System.out.println("this is i2");
  }
}

//multiple inheritance
class A implements I1,I2{
  @Override
 
  public void demo(){
    I1.super.demo();
    I2.super.demo();
   }
 

}



public class MultipleDemo2 {
  public static void main(String[] args) {
    A a = new A();
    a.demo();

  }
  
}
