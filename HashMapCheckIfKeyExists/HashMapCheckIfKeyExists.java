import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapCheckIfKeyExists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Musaka");
        map.put(2, "beer");
        map.put(3, "imamBaqlda");
        map.put(4, "kartofki");
        map.put(5, "neshtoDrugo");

        //         print the HashMap if we need it
        //        System.out.println("HashMap: " + map);

        int keyToBeChecked = scanner.nextInt();

        Iterator<Map.Entry<Integer, String>>
                iterator = map.entrySet().iterator();

        boolean isKeyPresent = false;

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();

            if (keyToBeChecked == entry.getKey()) {
                isKeyPresent = true;
            }
        }

        System.out.println("Does key "
                + keyToBeChecked
                + " exists: "
                + isKeyPresent);
    }
}
