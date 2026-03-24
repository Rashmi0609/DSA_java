import java.util.*; 
public class Basics {
    public static void printLetters(String str) {
        for(int i=0;i<str.length();i++){
            System.err.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="efgh";
        // String str2=new String("xyz");

        Scanner sc=new Scanner(System.in);   
        String name;
        name=sc.nextLine();
        System.out.println(name);

        String fullName="Rashmi Rajput";
        System.out.println(fullName.length());

        String firstName="Rashmi";
        String lastName="Rajput"; 
        String fullname=firstName+" "+lastName;
        System.out.println(fullname.charAt(1));

        printLetters(lastName);

        sc.close();

    }
    
}