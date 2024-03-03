package Lesson1;

class Sound {

    public static void main(String[] args)
             {
        // Use the given time for the echo from thunder to return
        double timeToEcho = 7.2; // Example time for the echo to return in seconds
        double oneWayTime = timeToEcho / 2.0; // Calculate one-way time

        // Calculate the distance in feet
        double speedOfSound = 1100.0; // Speed of sound in air in feet per second
        double distance = speedOfSound * oneWayTime;

        System.out.println("Distance to the Rock is " + distance + " feet.");
    }

}