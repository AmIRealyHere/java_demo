package Lesson12;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i=0; i<5; i++){
            System.out.println("Next value: " + ob.getNext());
        }
        System.out.println("RESET");
        ob.reset();
        for (int i=0; i<5; i++){
            System.out.println("Next value: " + ob.getNext());
        }
        System.out.println("Start value 100");
        ob.setStart(100);
        for (int i=0; i<5; i++){
            System.out.println("Next value: " + ob.getNext());
        }
        System.out.println("Previous value was");
        System.out.println(ob.getPrevious());

        System.out.println("By three:");
        for (int i=0; i<5; i++){

//            System.out.println("Next value" + ser.getNext());
        }
    }
}


