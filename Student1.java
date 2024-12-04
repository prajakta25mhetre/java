class Stud{
    private String name ;
    private int age;
    private char grade;
    
    Stud(){

    }
    Stud(String name, int age, char grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGrade() {
        return grade;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
    void diplayStudinfo(){
        
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("GRADE: "+grade);
    }
    static void show(){
        System.out.println("** Student Info **");
       
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " " + "Age: "+this.age + " " + "Grade: " + this.grade ; 
    }
}

public class Student1 {
    public static void main(String[] args) {
        Stud s = new Stud("prajakta", 10, 'A');
        Stud.show();
        s.diplayStudinfo();
       s.setName( "pratiksha");
        System.out.println(s.getName());
        s.setAge(   1 );
        System.out.println(s.getAge());
        s.setGrade('A');
        System.out.println(s.getGrade());
        System.out.println(s.toString());
    }
}
