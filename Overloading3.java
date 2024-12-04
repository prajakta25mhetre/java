public class Overloading3 {
    //rule 3 -- 
    private static int sum(int z, float a) {
        return (z + a);
    }
    private static int sum(float a, int z){
        return (a + z);
    }
    public static void main(String[] args) {
        float sum =0;
        sum = Overloading3.sum(10,1.2);

    }
    
}
