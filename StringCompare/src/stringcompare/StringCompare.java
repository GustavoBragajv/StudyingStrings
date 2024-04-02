package stringcompare;


public class StringCompare {

    public static void main(String[] args) {
        String s1 = new String("Hallo");
        String s2 = "Guten Morgen";
        String s3 = "BITTE";
        String s4 = "Bitte";
        
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
        
        System.out.println("Testando igualdade com EQUALS");
        if(s1.equals("Hallo")) {
            System.out.println("s1 é igual a Hallo");
        } else {
            System.out.println("s1 não é igual a Hallo");
        }
        
        System.out.println(" ");
        System.out.println("Testando igualdade com ==");
        if(s1 == "Hallo") {
            System.out.println("Eles são os mesmos objetos");
        } else {
            System.out.println("Eles não são os mesmo objetos");
        }
        
        System.out.println(" ");
        System.out.println("Testando igualdade com EQUALSIGNORECASE");
        if(s3.equalsIgnoreCase(s4)){
            System.out.println("s3 é igual a s4 mesmo ignorando a Case Sensitive das palavras");
        } else {
            System.out.println("s3 não é igual a s4");
        }
        
        System.out.println(" ");
        System.out.println("compareTo");
        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) is %d%n%n", s4.compareTo(s3));
        
        System.out.println("Distingue maiúsculas e minúsculas");
        if(s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match");
        } else {
            System.out.println("First 5 characters of s3 and s4 do not match");
        }
        
        System.out.println("");
        System.out.println("Ignora maiúsculas e minúsculas");
        if(s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match with case Ignored");
        } else {
            System.out.println("Firs 5 characters of s3 and s4 do not match");
        }
    }

}
