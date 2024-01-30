//inbuilt sorting
// collection.reverse order to get reversed array
import java.util.Arrays;
import java.util.Collections;
public class sorting5{
    public static void main(String args[]){
        Integer arr1[] ={5,4,1,3,2};
        Integer arr2[] ={5,4,1,3,2};
        Arrays.sort(arr1, Collections.reverseOrder());
        Arrays.sort(arr2,0,2,Collections.reverseOrder());
        printarr(arr1,arr2);
        
    }
    public static void printarr(Integer arr1[], Integer arr2[]){
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}