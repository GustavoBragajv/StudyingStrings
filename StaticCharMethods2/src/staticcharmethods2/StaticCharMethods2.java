/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticcharmethods2;

import java.util.Scanner;

/**
 *
 * @author higor
 */
public class StaticCharMethods2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter radix: ");
        int radix = scanner.nextInt();
        
        System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n", 
                "Convert digit to character", "Convert character to digit");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.print("Enter digit:");
                int digit = scanner.nextInt();
                System.out.printf("Convert digit to character: %s%n", Character.forDigit(digit, radix));
                break;
            case 2:
                System.out.print("Enter a character: ");
                char character = scanner.next().charAt(0);
                System.out.printf("Convert character to digit: %s%n", Character.digit(character, radix));
                break;
        }
    }
    
}
