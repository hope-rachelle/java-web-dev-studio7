package org.launchcode.studio7;

import java.util.Scanner;

public class Main {
    //Scanner input;

    public static void main(String[] args){
        DVD disc1 = new DVD("Interstellar", "DVD", 120, "movie");
        CD disc2 = new CD("Sia", "CD", 60, "music");
        Scanner input = new Scanner(System.in);
        String stop;

        System.out.println("What would you like to play, DVD or CD?");
        String choice = input.next().toUpperCase();
        if(disc1.getDiscType().equals(choice)) { disc1.startSpin();
            System.out.println("Press X to stop disc.");
            stop = input.next().toLowerCase();
            if(stop.equals("x")){ disc1.stopSpin(); }}

        else if(disc2.getDiscType().equals(choice)){ disc2.startSpin();
            System.out.println("Press X to stop disc.");
            stop = input.next().toLowerCase();
            if(stop.equals("x")){ disc2.stopSpin(); }}

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
