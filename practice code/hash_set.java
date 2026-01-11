import java.util.*;
public class hash_set {
    public static void main(String[] args) {
         // Set values = new HashSet();                         //it will not show in order form
        // Set values = new LinkedHashSet();                   //it will show in order form
        TreeSet<Integer> values = new TreeSet<>();  // Use TreeSet directly for sorting
        values.add(44);
        values.add(12);
        values.add(67);
        values.add(98);
        values.add(45);
        values.add(40);
        // System.out.println(values.contains(1));             //use to check element exits or not
        System.out.println(values);                // Prints in sorted order
        System.out.println(values.first());        // First element in the set
        System.out.println(values.last());         // Last element in the set
        System.out.println(values.headSet(45));    // Elements less than 45
        System.out.println(values.tailSet(45));    // Elements greater than or equal to 45
        System.out.println(values.subSet(12, 45)); // Elements between 12 (inclusive) and 45 (exclusive)
    }
}
