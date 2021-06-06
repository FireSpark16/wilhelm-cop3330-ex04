/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex04.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String noun = myApp.getNoun();
        String verb = myApp.getVerb();
        String adj = myApp.getAdj();
        String adv = myApp.getAdv();

        myApp.output(noun, verb, adj, adv);
    }

    private void output(String noun, String verb, String adj, String adv) {
        System.out.print("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");
    }

    private String getAdv() {
        System.out.print("Enter an adverb: ");
        return in.nextLine();
    }

    private String getAdj() {
        System.out.print("Enter an adjective : ");
        return in.nextLine();
    }

    private String getVerb() {
        System.out.print("Enter a verb: ");
        return in.nextLine();
    }

    private String getNoun() {
        System.out.print("Enter a noun: ");
        return in.nextLine();
    }
}