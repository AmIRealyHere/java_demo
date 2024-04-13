package Lesson12.bookpack;

public class AccessModifierDemonstrator {
    public int a; // from everywhere
    protected int c; // from package and child classes
    int b; //from package
    private int d; // inside class itself

    private int getA(){
        return a;
    }
}
