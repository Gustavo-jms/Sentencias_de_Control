package com.company;

public class Main {

    public static void main(String[] args) {
        var numIf = -3;
        var numWhile = 0;
        int station = 10;

        if (numIf < 0) {
            System.out.println("Number negative");
        } else if (numIf > 0) {
            System.out.println("Number positive");
        } else {
            System.out.println("the number is zero");
        }

        while (numWhile < 3) {
            System.out.println(numWhile + " " + "while");
            numWhile++;
        }
        do {
            System.out.println(numWhile + " " + "doWhile");
            numWhile++;
        } while (numWhile <= 3);
        {
            numWhile++;
        }
        for (int numFor = 0; numFor <= 3; numFor++) {
            System.out.println(numFor + " " + "numFor");
        }

        switch (station) {
            case 12, 1, 2:
                if (station == 12 || station == 1 || station == 2) {
                    System.out.println("Winter");
                    break;
                }
            case 3, 4, 5:
                if (station == 3 || station == 4 || station ==5){
                    System.out.println("Spring");
                    break;
                }
            case 6, 7, 8:
                if (station == 6 || station == 7 || station == 8){
                    System.out.println("Summer");
                    break;
                }
            case 9, 10, 11:
                if (station == 9 || station == 10 || station == 11){
                    System.out.println("Fall");
                    break;
                }
            default:
                System.out.println("Does not correspond to any station");
        }
    }
}

