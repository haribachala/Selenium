import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter string: ");
       String s1=s.nextLine();
       System.out.println(s1);
       for(int i=s1.length(); i>0; i--){
          System.out.print(s1.charAt(i-1));
        }


    }

    private static void fibonanci() {
        int a, b, c;
        a = 0;
        b = 1;
        c = 1;
        System.out.print(a + " " + b);
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + c);
            a = b;
            b = c;
            c = a + b;
        }
    }

}
