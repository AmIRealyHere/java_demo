package Practice;

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "line", "is", "a test."};

        System.out.println("Original Array: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        strs[2] = "also is";
        strs[3] = "a test!";

        System.out.println("Modified Array: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}
