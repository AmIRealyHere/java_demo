package Lesson15;

import java.util.Scanner;

public class Enumdemo{
    public static void main(String[] args) {
        Transport tr;

        tr = Transport.AIRPLANE;
        System.out.println("Value of tr: " + tr);

    if(tr == Transport.AIRPLANE){
        System.out.println("tr is equal to AIRPLANE");
    }
    switch (tr){
        case CAR -> System.out.println("its a car");
        case TRAIN -> System.out.println("its a train");
        case BOAT -> System.out.println("its a boat");
        case TRUCK -> System.out.println("its a truck");
    }
    Transport[] allTransports = Transport.values();
    for (Transport t: allTransports){
        System.out.println(t);
    }
        Scanner in = new Scanner(System.in);
        String candidate = in.nextLine();
    try{
        tr = Transport.valueOf(candidate.toUpperCase());}
        catch (IllegalArgumentException e){
            System.out.println("Sorry no such transport");
        tr = Transport.UNDEFINED;
    }
        System.out.println("Choose your transport:");
    for (Transport t: allTransports)
        System.out.println(t);

System.out.println("Speed " + tr.getSpeed());
    }
}
