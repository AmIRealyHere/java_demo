package Lesson4;

public class BreakLabelDemo {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <4 ; i++){
            one: {
                two: {
                    three: {
                        System.out.println("\n i equals " + i);
                        if (i==1) break one;
                        if (i==2) break two;
                        if (i==3) break three;

                        System.out.println("This line will never be displayed");
                    }
                    System.out.println("After block 3");
                }
                System.out.println("After block 2");
            }
            System.out.println("After block 1");
        }
        System.out.println("After the loop ");
    }
}
