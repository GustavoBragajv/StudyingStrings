package stringstartend;


public class StringStartEnd {

    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};
        
        System.out.println("Método startWith");
        for(String string : strings) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\" starts with \"st\"%n", string);
            }
        }
        System.out.println(" ");
        
        System.out.println("Método startWith iciando da posição 2 de starting"); 
        for(String string : strings) {
            if(string.startsWith("art", 2)) {
                System.out.printf("\"%s\" starts with \"art\" at position 2%n", string);
            }
        }
        
        System.out.println(" ");
        System.out.println("Método endsWith");
        for(String string : strings) {
            if(string.endsWith("ed")) {
                System.out.printf("\"%s\" ends with \"ed\" %n", string);
            }
        }
    }

}
