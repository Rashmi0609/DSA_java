import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];             
        }
        arr[0]=temp;  
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
