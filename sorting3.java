//insertion sort
// pick n put in the right place
import java.util.*;
public class sorting3{
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        insertionsort(arr);
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionsort(int arr[]){
        for(int i =1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out correct pos to insert
            while(prev >=0 && arr[prev]> curr){
                arr[prev +1 ] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev +1] = curr;
        }
    }
}
