import java.util.*;

class Hello{
    int func(int a , int b){
        return  a+b;
    }
}


public class Primitive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int  a = sc.nextInt();
        System.out.println("Enter second no: ");
        int b = sc.nextInt();

        Hello h = new Hello();
        int result = h.func(a, b);
        System.out.println("sum is : " + result);
        
    }
}