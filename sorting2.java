//selection sort
// select smallest put it at 1st
import java.util.*;
public class sorting2{
    public static void main(String args[]){
        int arr[] ={5,4,1,3,2};
        selectionsort(arr);
        printarr(arr);
    }
    public static void selectionsort(int arr[]){
        for(int i =0 ; i<arr.length-1 ; i++){ //last 2 element check karne ka zarurat ni islye arr.length -1
           int minpos = i; //to find smallest element
           for(int j =i+1 ; j<arr.length; j++){
            if(arr[minpos] > arr[j]){
                minpos =j ; //if element at 1st is greater than current(arr[j]) then make curr = minpos
            }
           }
           //swap
           int temp = arr[minpos];
           arr[minpos] = arr[i];
           arr[i] = temp;
        }
    }
    public static void printarr(int arr[]){
        System.out.print("sorted array = ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}