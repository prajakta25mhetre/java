class ArrayDemo{
    void func(int[] arr){
        for(int i = 0; i <arr.length ; i++){
            System.out.print( arr[i] + " " );
        }
        System.out.println();
    }

    void sum(int[] arr1){
        int sum =0;
        for(int i = 0; i <arr1.length; i++){
            sum += arr1[i];
        }
        System.out.print(sum + " " );
    }
}


public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        ArrayDemo a = new ArrayDemo();
        a.func(arr);
        a.sum(arr);


    }
    
}
