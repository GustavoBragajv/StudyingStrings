package stringindexmethods;


public class StringIndexMethods {

    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        System.out.println("Localizando uma letra atrvés do método indexOf");
        System.out.printf("'h' is located at index %d%n", letters.indexOf('h'));
        System.out.printf("'m' is located at index %d%n", letters.indexOf('m', 1));
        System.out.printf("'$' is located at index %d%n", letters.indexOf('$'));
        
        System.out.println("");
        System.out.println("testa lastIndexOf para localizar um caractere em um string");
        System.out.printf("Last 'b' is located at index %d%n", letters.lastIndexOf('b'));
        System.out.printf("Last 'r' is located at index %d%n", letters.lastIndexOf('r', 15));
        System.out.printf("Last '$' is located at index %d%n", letters.lastIndexOf('$'));
        
        System.out.println("");
        System.out.println("testa indexOf para localizar uma substring em um string");
        System.out.printf("\"def\" is located at index %d%n", letters.indexOf("def"));
        System.out.printf("\"def\" is located at index %d%n", letters.indexOf("def", 7));
        System.out.printf("\"hello\" is located at index %d%n", letters.indexOf("hello"));
        
        System.out.println("");
        System.out.println("testa lastIndexOf para localizar uma substring em uma string");
        System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def"));
        System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def", 25));
        System.out.printf("Last \"hello\" is located at index %d%n", letters.lastIndexOf("hello"));
    }

}
