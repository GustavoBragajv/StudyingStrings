/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package othercharmethods;

/**
 *
 * @author higor
 */
public class OtherCharMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Character c1 = 'A';
        Character c2 = 'a';
        
        System.out.printf("C1 = %s%nC2 = %s%n%n", c1.charValue(), c2.charValue());
        
        if(c1.equals(c2)) {
            System.out.println("c1 and c2 are equal");
        } else {
            System.out.println("c1 and c2 are not equal");
        }
    }
    
}
