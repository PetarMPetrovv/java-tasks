import java.util.Scanner;

public class StringReversion {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder reversed = new StringBuilder(A).reverse();
        String reversedString = reversed.toString();

        System.out.println(reversedString);



    }
}
