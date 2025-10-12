package Array;

public class arrayasFunction {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 98, 99, 100 };
        
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);
        
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }

}
