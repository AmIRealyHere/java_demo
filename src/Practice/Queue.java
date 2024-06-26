package Practice;

public class Queue {
    char q[];
    int putloc, getloc;

    public Queue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }
    public void put(char ch){
        if (putloc==q.length-1){
            System.out.println("- Queue is filled ");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    public char get(){
        if (getloc==putloc){
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
