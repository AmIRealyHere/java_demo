package Practice;

public class QDemoInteger {
    public static void main(String[] args) {
        IntQueue bigQ = new IntQueue(100);
        IntQueue smallQ = new IntQueue(4);
        int i;
        System.out.println("Using bigQ to store integers:");

        // Put integers into bigQ
        for (i = 0; i < 26; i++)
            bigQ.put(i);

        // Retrieve integers from bigQ and display
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            int num = bigQ.get();
            if (num != -1) System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Using smallQ to demonstrate errors:");

        // Use smallQ to demonstrate errors
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store: " + (10 - i));
            smallQ.put(10 - i);
            System.out.println();
        }
        System.out.println();

        // Additional errors accessing smallQ
        System.out.print("Contents of smallQ: ");
        for (i = 0; i < 5; i++) {
            int num = smallQ.get();
            if (num != -1) System.out.print(num + " ");
        }
    }
}

class IntQueue {
    private int[] queue;
    private int putloc, getloc;

    public IntQueue(int size) {
        queue = new int[size];
        putloc = getloc = 0;
    }

    public void put(int num) {
        if (putloc == queue.length) {
            System.out.println(" - Queue is full");
            return;
        }
        queue[putloc++] = num;
    }

    public int get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return -1;
        }
        return queue[getloc++];
    }
}
