package org.skillbox.lesson2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 200000; i <= 235000; i++) {
            System.out.println("Ticket №" + i);
            if (i == 210000) {
                i = 220000 -1;
            }
        }
    }
}
