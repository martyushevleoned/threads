package org.example.threads;

public class PrinterThread extends Thread {

    String word;

    public PrinterThread(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(word);
    }
}
