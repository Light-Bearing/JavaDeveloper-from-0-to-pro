package org.skillbox.lesson2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Integer dimaAge = 35;
        Integer mishaAge = 35;
        Integer vasyaAge = 35;

        Integer oldest;
        Integer youngest;
        Integer middle;

        if (dimaAge > mishaAge) {
            if (dimaAge > vasyaAge) {
                oldest = dimaAge;
                if (mishaAge > vasyaAge) {
                    middle = mishaAge;
                    youngest = vasyaAge;
                } else {
                    middle = vasyaAge;
                    youngest = mishaAge;
                }
            } else {
                oldest = vasyaAge;
                middle = dimaAge;
                youngest = mishaAge;
            }

        } else if (mishaAge > vasyaAge) {
            oldest = mishaAge;
            if (dimaAge > vasyaAge) {
                middle = dimaAge;
                youngest = vasyaAge;
            } else {
                middle = vasyaAge;
                youngest = dimaAge;
            }

        } else {
            oldest = vasyaAge;
            middle = mishaAge;
            youngest = dimaAge;
        }


        if (oldest != middle && middle != youngest) {
            System.out.println("Minimal age: " + youngest);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximum age: " + oldest);
        } else if (oldest == youngest) {
            System.out.println("Each of them: " + oldest);
        } else {
            System.out.println("Minimal age: " + youngest);
            System.out.println("Maximum age: " + oldest);
        }
    }

}
