/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author leroy
 */
public class Mileage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner inputDevice = new Scanner(System.in);
        int gallons;
        int miles;
        
        System.out.println("This program will calculate mileage:");
        System.out.println();
        
        
        System.out.print("Please enter mileage:");
        gallons = inputDevice.nextInt(); 
        System.out.println();
        
        System.out.print("Please enter Gallons:");
        miles = inputDevice.nextInt(); 
        System.out.println();
        
        //System.out.println("Gallons used are:" + gallons);
        //System.out.println("Mileage driven is:" + miles);
        
        int milesPerGallon = gallons / miles; 
        System.out.println("milesPerGallon: " + milesPerGallon); 
    }
    
}
