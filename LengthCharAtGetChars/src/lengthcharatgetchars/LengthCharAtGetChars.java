package lengthcharatgetchars;


public class LengthCharAtGetChars {

    public static void main(String[] args) {
        String s1 = "asacadadacasa";
        char[] charArray = new char[5];
        
        System.out.println("s1: " + s1);
        
        
        System.out.println("Método Length");
        System.out.println("A string contém " + s1.length() + " letras");
        
        for(int i = s1.length() - 1; i >= 0; i--){
            System.out.print(s1.charAt(i) + ", ");
        }
        System.out.println(" ");
        
        System.out.println("Método getChars");
        s1.getChars(0, 5, charArray, 0);
        
        for(char character : charArray) {
            System.out.println(character);
        }
        System.out.println("");
    }

}
