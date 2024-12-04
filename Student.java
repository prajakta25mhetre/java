public class Student {
    int id;
    String name;
    int marks;

   
    public class StudentDemo{
        public static void main(String[] args) {
            Student S = new Student();
            System.out.println(S.id + " " + S.name + " " + S.marks);
        }
    }
}

