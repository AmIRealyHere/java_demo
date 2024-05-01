package Lesson13;
import Lesson11.TwoDimensionShape;


public class ArrayUtils {
    int[] array;

    ArrayUtils(int[] array){
        this.array=array;
    }
    public void printArray() {
        System.out.println();
        for (int i =0; i< array.length;i++)
            System.out.print(array[i] + " ");
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i =0; i< array.length;i++)
            System.out.print(array[i] + " ");
    }
    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i;
    }

    public static int[] copyArray(int[] array, int[]arrayToCopyIn) {
        for (int i=0; i< arrayToCopyIn.length; i++){
            if (i< array.length)
                arrayToCopyIn[i] = array[i];
            else break;
        }
        return arrayToCopyIn;
    }
    public static void printArray(TwoDimensionShape[] array){
        System.out.println();
        for (int i =0; i< array.length;i++){
            System.out.println(array[i].getName());
            array[i].showDimensions();
    }

}
}