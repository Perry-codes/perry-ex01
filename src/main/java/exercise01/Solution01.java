/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Maggie Perry
 */
/*
Set scanner to accept keyboard input

Prompt user to enter their name

Concatenate name into a welcome message string

Output welcome message

 */

package exercise01;

import java.util.Scanner;

public class Solution01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name? ");

        String userName = sc.nextLine();

        String welcomeMessage = "Hello, " + userName + ", nice to meet you!";

        System.out.println(welcomeMessage);

    }
}
