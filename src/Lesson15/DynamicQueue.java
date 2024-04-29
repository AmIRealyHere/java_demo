package Lesson15;

public class DynamicQueue implements InterfaceCharQueue{
    private char[] q;
    private int putloc,getloc;

    @Override
    public void put(char ch){
        if (putloc == q.length -1){
            char[] t = new  char[q.length * 2];
            for (int i=0; i<q.length; i++){
                t[i] = q[i];
            }
            q=t;
        }
        putloc++;
        q[putloc]=ch;
    }
    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("\nThe queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
