package com.company;

public class Q2 {
    boolean isAGreen;

    public Q2() {
        isAGreen = true;
    }

    public void carArrived(
            int carId,
            int roadId,
            int direction,
            Runnable turnGreen,
            Runnable crossCar
    ) {
        if(roadId == 2 && isAGreen == true || roadId == 1 && isAGreen ==false){
            turnGreen.run();
            isAGreen = !isAGreen;
        }
        crossCar.run();
    }
}