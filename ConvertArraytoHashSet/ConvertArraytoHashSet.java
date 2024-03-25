import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class ConvertArraytoHashSet {
    static Set<Integer> convert(int[] array) {
        Set<Integer> Set = new HashSet<>();

        for (int element : array) {
            Set.add(element);
        }
        return Set;
    }

    static void print(Set<Integer> Set) {
        Iterator<Integer> iterator = Set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4, 5, 6 };

        Set<Integer> Set = convert(array);

        print(Set);
    }
}
