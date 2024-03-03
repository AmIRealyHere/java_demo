package Lesson2;

public class ShortHandOrSideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        if(false && (++i < 100))
            System.out.println("THIS STRING won't be displayed.");
        System.out.println("The if operator was executed: " +i);
    }
}
