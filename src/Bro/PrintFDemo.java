package Bro;

public class PrintFDemo {
    public static void main(String[] args) {

//        System.out.printf("This is a format string %d", 123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;
// [conversion character]
//        System.out.printf("%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);

        // [width]
//        System.out.printf("Hello %20s", myString);

        // [precision]
//        System.out.printf("You have this much money %.2f", myDouble);
//[flags]
        System.out.printf("Hello %-20s", myString);

        // - : left-justify
        // + : output a (+) or (-) sign for a numeric value
        // 0 : numeric value are zero - padded
        // , : comma grouping separator if numbers > 1000
    }
}
