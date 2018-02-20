package com.company;

import java.util.Scanner;

public class Main {

    private String[] _zodis = new String[5];

    public static void main(String[] args) {
        // 3b.
        //​
        // Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.  Po to kai bus įvesti visi
        //žodžiai, jie turi būti atvaizduojami

        Main obj = new Main();
        obj.ivedimas();
        obj.spausdinimas();


    }

    public void ivedimas() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < _zodis.length; i++) {
            System.out.println("Iveskite zodi nr: " + (i + 1));
            _zodis[i] = in.nextLine();
        }
    }

    public void spausdinimas() {
        System.out.println("Ivesti zodziai:");
        for (String z : _zodis) {
            System.out.println(z);
        }
    }
}
