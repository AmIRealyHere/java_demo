package L678HW.QSDemo3;

public class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.print("Source Array: ");
        for (i=0; i<a.length; i++)
            System.out.print(a[i]);

        System.out.println();

        Quicksort.qsort(a);

        System.out.print("Sorted Array: ");
        for (i=0; i< a.length; i++)
            System.out.print(a[i]);
    }
}
