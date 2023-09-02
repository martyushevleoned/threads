package org.example;

import org.example.carParking.Consumer;
import org.example.carParking.Parking;
import org.example.carParking.Producer;
import org.example.threads.PrinterRunnable;
import org.example.threads.PrinterThread;
import org.example.values.AtomicValueStorage;
import org.example.values.ValueStorage;
import org.example.volatil.Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Способы создания потоков

//        PrinterThread pt = new PrinterThread("AAA");
//        PrinterRunnable pr = new PrinterRunnable("BBB");
//
//        pt.start();
//        new Thread(pr).start();
//        new Thread(()-> System.out.println("CCC")).start();

//        Атомарные приколы

//        for (int i = 0; i < 5; i++)
//            new Thread(() -> {
//                for (int j = 0; j < 100000; j++)
//                    ValueStorage.incrementValue();
//                System.out.println(ValueStorage.getValue());
//            }).start();
//
//        for (int i = 0; i < 5; i++)
//            new Thread(() -> {
//                for (int j = 0; j < 100000; j++)
//                    AtomicValueStorage.incrementValue();
//                System.out.println(AtomicValueStorage.getValue());
//            }).start();

//        Ключевое слово volatile

//        Task task = new Task();
//        new Thread(task).start();
//
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//
//        task.stop();
//        System.out.println("Main: " + task.getCounter());

//        Взаимодействие потоков

//        Parking parking = new Parking();
//
//        Thread thread1 = new Thread(new Producer(parking));
//        Thread thread2 = new Thread(new Consumer(parking));
//
//        thread1.start();
//        thread2.start();
    }
}