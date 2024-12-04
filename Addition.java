public class Addition{
    int num1;
    int num2;

    Addition(){

    }

    Addition(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //instance method/ non static method
    public double addnum(int a, int b){
        double sum = 0;

        sum=a+b;
        return sum;
    }
}

public class Methods {
   public static void main(String[] args) {
    Addition add = new Addition();
    int sum = add.addnum(3,4);
    System.out.println(sum);
   } 
}
