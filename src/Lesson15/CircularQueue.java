package Lesson15;

public class CircularQueue implements InterfaceCharQueue{
    private char q[];
    private int putloc, getloc;

    CircularQueue(int size){
        q= new char[size+1];
        putloc=getloc=0;
    }

    @Override
    public void put(char ch){
        if(putloc+1 == getloc | ((putloc==q.length -1)
        & (getloc ==0))){
            System.out.println("\nThe queue is full");
            return;
        }
        putloc++;
        if (putloc==q.length) putloc=0;
        q[putloc] = ch;
    }

    @Override
    public char get(){
        if (getloc==putloc){
            System.out.println("\nThe queue is empty");
            return(char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc=0;
        return q[getloc];
    }
}
