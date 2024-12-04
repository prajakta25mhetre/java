 class AnimalDemo{
    String name;
    String color;
    int age;

    AnimalDemo(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    @Override
    public String toString(){
        return "name: " + this.name+" color: "+this.color+" age: "+this.age;
    }

    public class Animal1{
        public static void main(String[] args) {
            AnimalDemo demo= new AnimalDemo("dog", "black", 2);
            System.out.println(demo.toString());
        }
    }
}