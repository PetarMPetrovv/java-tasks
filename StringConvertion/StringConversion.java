import java.util.Scanner;

public class StringConversion {

    public static void main(String[] args) {

        // 3 tasks: print sum of both lengths, find if A is greater lexicographically and
        // transform both strings first letter to uppercase


        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sumLength = A.length() + B.length();

        int isAGreaterLexigraphicallyInt = 0;

        for (int i = 0; i < A.length() && i < B.length(); i++) {
            if((int)A.charAt(i) == (int)B.charAt(i)) {
            } else {
                isAGreaterLexigraphicallyInt = A.charAt(i) - B.charAt(i);
                break;
            }
        }
        
        String isAGreaterLexicographically;
        if (isAGreaterLexigraphicallyInt > 0) {
            isAGreaterLexicographically = "Yes";
        } else {isAGreaterLexicographically = "No";}

        String s1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String s2 = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sumLength);
        System.out.println(isAGreaterLexicographically);
        System.out.println(s1 + " " + s2);
    }



}
