/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokentest;

import java.util.Scanner;

/**
 *
 * @author higor
 */
public class TokenTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();
        
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are: %n", tokens.length);
        
        for(String token : tokens) {
            System.out.println(token);
        }
    }
    
}
