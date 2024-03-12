package Lesson4;

public class BreakingOutOfNestedLoop  {
    public static void main(String[] args) {
        done:

        for (int i = 0; i < 10; i++){
            System.out.println("The i loop iteration" + i);
            for (int j = 0; j < 10; j++){
                System.out.println("The j loop iteration" + j);
                for (int k = 0; k < 10; k++){
                    System.out.println(k + " ");
                    if (k == 5) break done;

                }
                System.out.println("After k loop");
            }
            System.out.println("After j loop");

        }
        System.out.println("After i loop");
    }}

