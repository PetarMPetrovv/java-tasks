import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
           char current = input.charAt(i);
           output = output + current;
        }
        System.out.println("Reversed string: " + output);
    }
}
