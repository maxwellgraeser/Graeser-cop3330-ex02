/*
 *  UCF COP3330 Fall 2021 Exercise 2 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class CharacterNum {
    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String iString = input.nextLine();
        int length = iString.length();
        System.out.println(iString + " has " + length + " characters.");

    }
}
