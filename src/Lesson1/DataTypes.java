package Lesson1;

import java.sql.SQLOutput;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("INTEGER DATA TYPES");
        byte b = 127;
        short s = 32;
        int i = 1;
        long l = -356;

        System.out.println("Byte type HAS 8 bits can have values in range from: from -128 to 127 "
                + "Exapmle: b = " + b);
        System.out.println("Short type: from -32768 to 32767 "
                + "Exapmle: s = "  + s);
        System.out.println("Int type: from -2,147,483,648 to 2,147,483,647 "
                + "Exapmle: i = " + i);
        System.out.println("Long type: from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 "
                + "Exapmle: b = " + l);

        System.out.println("FLOATING POINT DATA TYPES");
        float f = 127f;
        double d = 32.78;

        double result = f / d;

        double pi = Math.PI;
        System.out.println("PI: " + pi);

        System.out.println("Float type has 32 bits.  "
                + "Exapmle: f = " + f);
        System.out.println("Double type has 64 bits "
                + "Exapmle: result = "  + result);

        System.out.println("CHARACTER DATA TYPES");
        //char c = 65;
        char c1 = 'B';
        int codeOfA = (int) c1;


        System.out.println("Char type example c = " + c1);

     System.out.println("LOGICAL DATA TYPES");
    //char c = 65;
    boolean tr = true;
    boolean fal = false;

        System.out.println("Logical type  " + "Example: tr = " + tr);
        System.out.println("Logical type  " + "Example: 10>=8 is " + (10>=8));

if(fal) System.out.println("You've put the same in variables fal and tr ");

int i1 = 5;
int i2 = 2;
int i3 = -2;
int i4 = 0;
int res;
res = i1 + i2;
        System.out.println("result of i1 + i2 is " + res);
        res = i1 - i2;
        System.out.println("result of i1 - i2 is " + res);
        res = i1 * i2;
        System.out.println("result of i1 * i2 is " + res);
        res = i1 / i2;
        System.out.println("result of i1 / i2 is " + res);
        res = i1 % i2;
        System.out.println("result of i1 % i2 is " + res);
    }
}
