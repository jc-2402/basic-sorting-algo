//basic sorting algo
//bubble sort for increasing order
//take largest to end by swapping with adjactent element
import java.util.*;
public class sorting1{
    public static void bubblesort(int arr[]){
        int swap =0;
        for(int turn = 0 ; turn<arr.length-1; turn++){
            for(int j =0 ; j<arr.length-1 - turn ; j++){
                //swap
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swap++;
                   System.out.print("ho raha h");
                }
            }
            if(swap == 0){
                  System.out.print("sorted hai bhai");
                break;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("enter 5 elements for array \n");
        for(int i =0 ; i<arr.length ;i++){
            arr[i] = s.nextInt();
        }
        bubblesort(arr);
        printarr(arr);
    }
} 