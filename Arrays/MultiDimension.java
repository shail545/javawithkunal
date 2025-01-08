import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // number of rows is mandatory  but no of columns is not mandatory 
        int[][] arr = new int[n][m];
        
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        // another way to print 

        for(int i =0; i<n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // for(int i=0; i<n;i++){
        //     for(int j=0; j<m;j++){
        //        System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
      

        // int [][] arr = {
        //     {1,2,3},
        //     {4,5,6,4,5},
        //     {7,8,9}
        // };
        // System.out.println(Arrays.toString(arr[1]));

    }
}
