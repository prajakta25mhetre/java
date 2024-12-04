class Animal{
    void eat(){
        System.out.println("This ANimal class can eat");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Mammals can walk");
    }

}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dog can bark");
    }

}

public class Multi {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.walk();
        dog.eat();
        Mammal mammal = new Mammal();
        mammal.walk();
        mammal.eat();
        //mammal.bark();//we cannot access child class properties by creating the obj of parent class.
        
    }
    
}
