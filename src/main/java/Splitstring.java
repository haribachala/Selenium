public class Splitstring {
    public static void main(String[] args) {
        String s = "abc,def,ghi";

        String[] split = s.split(",");
       for (int i=0 ; i<split.length; i++){
           System.out.println(split[i]);

       }

    }


}
