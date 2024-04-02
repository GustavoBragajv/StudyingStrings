package substring;


public class SubString {

    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        System.out.println("testa métodos substring");
        System.out.printf("Substring for index 20 to end is \"%s\"%n", letters.substring(20));
        System.out.printf("%s \"%s\"%n", "Sustring form index 3 up to, but not including 6 is", letters.substring(3, 6));
    }

}
