package Mosh;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
//        int[][][] numbers = new int[2][3][5];
        int[][] numbers ={{ 1,2,3,},{4,5,6,}};
//        numbers[0][0] =1;
        System.out.println(Arrays.deepToString(numbers));
    }
}
