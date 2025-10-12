public class primeORnot {
    //corner cases
    //2
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2 ; i<=n-1 ;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }
}
