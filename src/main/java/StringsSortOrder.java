import java.util.Scanner;

public class StringsSortOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=scanner.nextInt();
        String[]  input=new String[count];
        Scanner s2=new Scanner(System.in);
        for (int i=0; i<count ;i++) {
            input[i] = s2.next();
        }
        /*for (String s : input) {
            System.out.println(s);
        }*/

        for (int i = 0; i <count ; i++) {
            for (int j = i+1; j+1 < i; j++) {

            }
        }


    }



}
