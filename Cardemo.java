class car{
    int no;
    String name;
    String color;

    //dafault constructor
    car(){

    }

    //parameterised constructor
    car(int no, String name, String color){
        this.no = no;
        this.name = name;
        this.color = color;
    }


}
public class Cardemo {
    public static void main(String[] args) {
        car c = new car(0001, "minincopper", "blue");
        System.out.println(c.no);
        System.out.println(c.name);
        System.out.println(c.color);
    }

}

