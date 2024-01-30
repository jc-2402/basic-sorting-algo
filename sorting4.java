//inbuilt sorting
import java.util.Arrays;
public class sorting4{
    public static void main(String args[]){
        int arr1[] ={5,4,1,3,2};
        int arr2[] ={5,4,1,3,2};
        Arrays.sort(arr1);
        Arrays.sort(arr2,0,2);
        printarr(arr1,arr2);
        
    }
    public static void printarr(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}