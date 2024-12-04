 //setters and getters.
 //to access the private variables we use getters and setters.
 
 class Person1{

    private int x;
    private String name;
    Person1(){

    }
    Person1(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
 }

 class Person{
    int a;
    int b;

    Person(){};
    Person(int a, int b){
        this.a=a;
        this.b=b;

    }
}

public class Setget {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.a);
        System.out.println(p.b);
        Person1 p1 = new Person1();
        System.out.println(p1.getX());
        p1.setName("prajakta");
        System.out.println(p1.getName());

    }
    
    
}
