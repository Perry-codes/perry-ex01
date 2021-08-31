/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Maggie Perry
 */
/*
Set scanner to accept keyboard input

Prompt user to enter their name

Concatenate name into a welcome message string

Output welcome message

 */

package ex01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        String userName = scanner.nextLine();

        String welcomeMessage = "Hello, " + userName + ", nice to meet you!";

        System.out.println(welcomeMessage);

    }
}
