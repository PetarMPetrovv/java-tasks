import java.util.Scanner;

public class FindSubstrings {


        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            int minIndex = 0;
            int maxIndex = 0;


            for (int i = 0; i < s.length(); i++) {
                if((int)s.charAt(i) < s.charAt(minIndex)){
                    minIndex = i;
                }
                if((int)s.charAt(i) == s.charAt(minIndex)){
                    for (int j = 1; j < k && j < s.length(); j++) {
                        if((int)s.charAt(j) < (int)s.charAt(minIndex + j)
                                && i + k < s.length()){
                            minIndex = i;
                        }
                    }
                }


                if((int)s.charAt(i) > s.charAt(maxIndex)){
                    maxIndex = i;
                }
                if((int)s.charAt(i) == s.charAt(maxIndex)){
                    for (int j = 1; j < k && j < s.length(); j++) {
                        if((int)s.charAt(j) > (int)s.charAt(maxIndex + j)
                                && i + k < s.length()){
                            maxIndex = i;
                        }
                    }
                }


            }

            for (int i = 0; i < k; i++) {
                smallest = smallest + s.charAt(minIndex + i);
                largest = largest + s.charAt(maxIndex + i);
            }



            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
}
