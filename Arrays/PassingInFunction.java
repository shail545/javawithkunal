import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int nums[]={1,2,3,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Arrays are mutable in java but string are immutable in java 
    
    static void change(int arr[]){
        arr[0] = 100;
    }
}
