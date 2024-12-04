class Animal{
    String name;
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class Human extends Animal{
    float salary;
    Human (){
       // super();
        System.out.println("Human default Constructor");
    }
    Human(String name ,Float salary){
        
        this.salary = salary;
    }

}
public class ConsInheri {
    public static void main(String[] args) {
       Human human = new Human();
        //human.Human();
       // Human h = new Human("praj", 2000);


    }
}
