/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit1homework2;

/**
 *
 * @author leroy
 */
import java.util.Scanner;

public class Unit1Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner inputDevice = new Scanner(System.in);
         String name, ageGroup;
         int age; 
         
         System.out.print("Enter your Name: ");
        name = inputDevice.nextLine();
        
        System.out.print("Enter your age; ");
        age = inputDevice.nextInt();
        System.out.println();
        
         if (age < 1) {
            ageGroup = "Infant";
        } else if (age >= 1 && age <= 3) {
            ageGroup = "Toddler";
        } else if (age >= 4 && age <= 5) {
            ageGroup = "Preschooler";
        } else if (age >= 6 && age <= 12) {
            ageGroup = "Grade Schooler";
        } else if (age >= 13 && age <= 18) {
            ageGroup = "Teenager";
        } else if (age >= 19 && age <= 21) {
            ageGroup = "Young Adult";
        } else {
            ageGroup = "Adult";
        }
         System.out.println(name + " is a " + ageGroup + ".");
    }
    
    
}
