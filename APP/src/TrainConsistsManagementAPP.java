import java.util.*;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        int n = 100000; // number of elements

        // ---------------- HashSet ----------------
        long startHash = System.nanoTime();

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }

        long endHash = System.nanoTime();

        // ---------------- TreeSet ----------------
        long startTree = System.nanoTime();

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(i);
        }

        long endTree = System.nanoTime();

        // ---------------- LinkedHashSet ----------------
        long startLinked = System.nanoTime();

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            linkedSet.add(i);
        }

        long endLinked = System.nanoTime();

        // ---------------- Results ----------------
        System.out.println("Performance Comparison (Insertion of " + n + " elements)\n");

        System.out.println("HashSet Time: " + (endHash - startHash) + " ns");
        System.out.println("TreeSet Time: " + (endTree - startTree) + " ns");
        System.out.println("LinkedHashSet Time: " + (endLinked - startLinked) + " ns");

        System.out.println("\nNote:");
        System.out.println("HashSet is fastest (no ordering)");
        System.out.println("TreeSet is slowest (sorting required)");
        System.out.println("LinkedHashSet is balanced (insertion order maintained)");
    }
}