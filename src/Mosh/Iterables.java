package Mosh;
import Mosh.GenericList;

public class Iterables {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item : list) {
            System.out.println(item);
        }
    }
}
