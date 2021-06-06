/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 4 - Mad Lib

        Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

        Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.
        Example Output

        Enter a noun: dog
        Enter a verb: walk
        Enter an adjective: blue
        Enter an adverb: quickly
        Do you walk your blue dog quickly? That's hilarious!

        Constraints

        Use a single output statement for this program.
        If your language supports string interpolation or string substitution, use it to build up the output.

        Challenges

        Add more inputs to the program to expand the story.
        Implement a branching story, where the answers to questions determine how the story is constructed.
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String noun = myApp.readNoun();
        String verb = myApp.readVerb();
        String adj = myApp.readAdj();
        String adv = myApp.readAdv();
        String outputString = myApp.generateOutputString(noun, verb, adj, adv);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readNoun() {
        System.out.println("Enter a noun: ");
        return in.nextLine();
    }

    public String readVerb() {
        System.out.println("Enter a verb: ");
        return in.nextLine();
    }

    public String readAdj() {
        System.out.println("Enter an adjective: ");
        return in.nextLine();
    }

    public String readAdv() {
        System.out.println("Enter an adverb: ");
        return in.nextLine();
    }

    public String generateOutputString(String noun, String verb, String adj, String adv) {
        return String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
    }
}
