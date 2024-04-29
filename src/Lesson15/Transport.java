package Lesson15;

public enum Transport {
    AIRPLANE(533), BOAT(33), CAR(220), TRAIN(300), TRUCK(100), UNDEFINED(0);

    private final int speed;
    Transport(int i){
        speed = i;
    }
    int getSpeed(){
        return speed;
    }
}
