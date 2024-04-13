package Practice;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1,2,3};
        int table[][] = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println("List Dimension " + list.length);
        System.out.println("nums Dimension " + nums.length);
        System.out.println("table Dimension " + table.length);
        System.out.println("table[0] Dimension " + table[0].length);
        System.out.println("table[1] Dimension " + table[1].length);
        System.out.println("table[2] Dimension " + table[2].length);
        System.out.println();

        for (int i = 0; i< list.length; i++)
            list[i] = i*i;
        System.out.println("List content ");
        for (int i = 0; i< list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
