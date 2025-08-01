public class swap {

    public static void Swap(int a, int b) {
        int temp= a;
        a=b;
        b=temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        Swap(a,b);
        System.out.println("Before swapping: a = " + a + ", b = " + b);
    }
}
