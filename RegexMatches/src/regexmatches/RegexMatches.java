/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regexmatches;

import java.beans.Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author higor
 */
public class RegexMatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pattern expresion = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        
        String string1 = "Jane's Birthday is 05-12-75\n"+
                "Dave's Birthday is 11-04-68\n"+
                "John's Birthday is 04-28-73\n"+
                "Joe's Birthday is 12-17-77\n";
        
        Matcher matcher = expresion.matcher(string1);
        
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    
}
