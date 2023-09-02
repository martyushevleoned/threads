package org.example.threads;

public class PrinterRunnable implements Runnable {

    String word;

    public PrinterRunnable(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(word);
    }
}
