import java.lang.system;

class Animal{
  void eat(){
    System.out.println("All animal can eat veg and non veg");
  }
}
class Cow extends Animal{
  @Override
  void eat(){
    System.out.println("cow can eat only veg ");
  }
}

class Tiger extends Animal{
  @Override
  void eat(){
    System.out.println("tiger can eat only non-veg ");
  }
}



public class Overriding {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    Cow cow = new Cow();
    cow.eat();
  }
}


