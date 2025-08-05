public class overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers: " + sum(10, 20));
        System.out.println("Sum of 3 numbers: " + sum(10, 20, 30));
        System.out.println("Add of 2 integers: " + add(10, 20));
        System.out.println("Add of 2 floats: " + add(10.5f, 20.5f));
    }
}
