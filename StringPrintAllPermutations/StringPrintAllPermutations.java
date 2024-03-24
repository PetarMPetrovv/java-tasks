import java.util.Scanner;

public class StringPrintAllPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        printPermutations(s, "");
    }
    static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i + 1);

            printPermutations(ros, ans + ch);
        }
    }
}
