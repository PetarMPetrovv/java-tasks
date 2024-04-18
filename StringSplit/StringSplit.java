import java.io.*;
import java.util.*;

public class StringSplit {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.

            String[] tokens = s.trim().split("[ !,?._'@]+");

            int count = 0;

            for(String token : tokens) {
                if(!token.isEmpty()){
                    count++;
                }
            }

            System.out.println(count);

            for(String token : tokens) {
                if(!token.isEmpty()){
                    System.out.println(token);
                }
            }


            scan.close();
        }
}
