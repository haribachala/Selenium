public class MatchBrackets {
    public static void main(String[] args) {
        String s = "))()";
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftCount++;
            } else if (c == ')') {
                rightCount++;
            }
        }
        if (leftCount > rightCount) {
            System.out.println(leftCount - rightCount);
        } else {
            System.out.println(rightCount - leftCount);
        }
    }
}
