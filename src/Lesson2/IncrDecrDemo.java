package Lesson2;

public class IncrDecrDemo {
    public static void main(String[] args) {
        int x, y;

        x = 2;
        y = -45;

        x = x + 1;
        System.out.println("did x = x+1, now x is " +x);
        x++;
        System.out.println("did X++, now x is " + x);
        x++;
        System.out.println("did X++, now x is " + x);
        x += 5;
        System.out.println("did x+=5, now x is " + x);
        x -= 5;
        System.out.println("did x+=5, now x is " + x);
        x *= 5;
        x = x * 5;

        x /= 5;
        x = x / 5;

        x = 12;
        x %= 5;
        x = x % 5;
        System.out.println("x = " +x);

        boolean t = true;
        boolean f = false;

        t &= true;
        System.out.println("t = " +t);
        t ^= true;
        System.out.println("t = " +t);
        t &= false;
        System.out.println("t = " +t);


    }
}
