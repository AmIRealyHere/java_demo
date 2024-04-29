package Mosh.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection= new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
//        collection.remove("a");
//        var containsA = collection.contains("a");
//        System.out.println(containsA);
//        System.out.println(collection);
//        System.out.println(collection.size());
//       Object[] objectArray = collection.toArray();
//       String[] stringArray = collection.toArray(new String[0]);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection == other);
        System.out.println(collection.equals(other));

    }
}
