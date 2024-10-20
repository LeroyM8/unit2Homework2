/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leroy
 */
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        String firstName, lastName, fullName;
        char firstInitial;
        int Length;

        System.out.println("This program will prompt user for first name & last name");

        System.out.print("Enter your First Name>>>>>>");
        firstName = inputDevice.nextLine();

        System.out.print("Enter your Last Name>>>>>>");
        lastName = inputDevice.nextLine();
        System.out.println();

        fullName = firstName + " " + lastName;

        System.out.println(fullName);

        firstInitial = firstName.charAt(0);
        System.out.println("The first initial is: " + firstInitial);

        fullName = fullName.toUpperCase();
        System.out.println("Fullname in all caps: " + fullName);

        Length = fullName.length(); 
        
        System.out.println("Number of characters including spaces: " + Length);
    }

}
