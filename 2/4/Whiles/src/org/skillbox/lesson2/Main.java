package org.skillbox.lesson2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 200000;
        do {
            System.out.println("Ticket №" + i++);
            if (i == 210000) {
                System.out.println("Ticket №" + i);
                i = 220000;
            }
        }
        while (i <= 235000);
    }
}
