public class Oveerloading {
    //rule 1== if the name of the method is same then the param int the methods should be different.
    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
    private static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    } 

    
    public static void main(String[] args){
        int sum = Oveerloading.sum(2, 6);
        System.out.println(sum);
        int sum1 = Oveerloading.sum(1,2,3);
        System.out.println(sum1);
    }
    
}
