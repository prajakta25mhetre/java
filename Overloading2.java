public class Overloading2 {

    //rule 2==
    
    private static int sum(int x, int y) {
        return (x + y);
    }
    private static double sum(int z, double a){
        return (z + a);
    }
    
    public static void main(String[] args) {
        int sum = 0;
        sum = Overloading2.sum(10,20);
        System.out.println(sum);
        double sum1 = Overloading2.sum(30,300000);
        System.out.println(sum1);

    }
    
}
