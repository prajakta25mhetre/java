abstract class Vehicle{   //abstract class 
  public abstract int getNoOfWheels(); //abstract method 
}

class Auto extends Vehicle{ 
  @Override
  public int getNoOfWheels(){ //implementation of abstract method
    return 3;
  }
}

class Bike extends Vehicle{
  @Override
  public int getNoOfWheels(){ 
    return 2;
  }
}

public class Test {
  public static void main(String[] args) {
    Auto a = new Auto();
    int Wheelcount = a.getNoOfWheels();
    System.out.println(Wheelcount);

    Bike b = new Bike();
    Wheelcount = b.getNoOfWheels();
    System.out.println(Wheelcount);
  }
  
}
