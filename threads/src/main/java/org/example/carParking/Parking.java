package org.example.carParking;

public class Parking {
    private int places = 50;
    private int cars = 0;

    public synchronized void in(){
        if (cars == places) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        cars++;
        System.out.println("cars count: " + cars);
        notify();
    }

    public synchronized void out(){
        if (cars == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        cars--;
        System.out.println("cars count: " + cars);
        notify();
    }

}
