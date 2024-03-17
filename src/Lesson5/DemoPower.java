package Lesson5;

public class DemoPower {
    public static void main(String[] args) {
        Pwr x = new Pwr (4.0, 2);
        Pwr y = new Pwr (2.5, 1);
        Pwr z = new Pwr (5.7, 0);

        System.out.println(x.b + " power of " + x.e + " equals " + x.get_pwr());
        System.out.println(y.b + " power of " + y.e + " equals " + y.get_pwr());
        System.out.println(z.b + " power of " + z.e + " equals " + z.get_pwr());
    }
}
