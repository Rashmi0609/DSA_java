package Array;

public class LargestAndSmallest {
    public static int getLargest(int numbers[]) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];  
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest no. is: "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,4,7};
        System.out.println("Largest no. is: "+ getLargest(numbers));
        
    }
}

