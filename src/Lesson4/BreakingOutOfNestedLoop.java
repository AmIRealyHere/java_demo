package Lesson4;

public class BreakingOutOfNestedLoop  {
    public static void main(String[] args) {

done:
        for (int i = 0; i < 10; i++){
            System.out.print("The i loop iteration " + i + "\n");
            for (int j = 0; j < 10; j++){
                System.out.print("The j loop iteration " + j + " \n");
                for (int k = 0; k < 10; k++){
                    System.out.print(k + " ");
                    if (k == 5) break done;
                }
                System.out.println("After k loop");
            }
            System.out.println("After j loop");

        }
        System.out.println("After i loop");
    }}

