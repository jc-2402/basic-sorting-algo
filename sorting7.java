// descending order
// bubble, selection, insertion and counting
import java.util.*;
public class sorting7{
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        //bubblesort(arr);
        //selectionsort(arr);
        //insertionsort(arr);
        countingsort(arr);
        printarr(arr);
    }
    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length -1; turn++){
            for(int j=0 ; j<arr.length-1-turn; j++){
                //swap
                if(arr[j] <arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void selectionsort(int arr[]){
        for(int i =0 ; i<arr.length-1 ; i++){ //last 2 element check karne ka zarurat ni islye arr.length -1
           int minpos = i; //to find smallest element
           for(int j =i+1 ; j<arr.length; j++){
            if(arr[minpos] < arr[j]){
                minpos =j ; //if element at 1st is greater than current(arr[j]) then make curr = minpos
            }
           }
           //swap
           int temp = arr[minpos];
           arr[minpos] = arr[i];
           arr[i] = temp;
        }
    }
    
    public static void insertionsort(int arr[]){
        for(int i =1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out correct pos to insert
            while(prev >=0 && arr[prev] < curr){
                arr[prev +1 ] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev +1] = curr;
        }
    }
    
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=count.length-1; i>=0 ;i--){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
    }
}