package com.company;
//Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
//        Input:  A
//        Output:  Capital letter
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);

        if(ch>='a' && ch<='z')
            System.out.println("Small Letter");


        else if(ch>='A' && ch<='Z')

            System.out.println("Capital Letter");


        else if(ch>='0' && ch<='9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }


}

