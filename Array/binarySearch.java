package Array;
import java.util.*;
public class binarySearch {
    public static int binSearch(int numbers[],int key) {
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1; 
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={1,4,8,3,10,6};
        Arrays.sort(numbers);
        int key=3;
        System.out.println("key at index: "+ binSearch(numbers,key));
    }
}
