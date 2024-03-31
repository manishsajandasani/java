public class StringBasics {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("hello");
        char[] s3 = new char[] {'H', 'e', 'l', 'l', 'o'};
                
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Reference Comparison is " + (s1 == s2));
        System.out.println("Value Comparison (Case) is " + s1.equals(s2));
        System.out.println("Value Comparison (Ignore Case) is " + s1.equalsIgnoreCase(s2));
        
        String s4 = s1;
        System.out.println("s4 == s1 is " + (s1 == s4));
        System.out.println("s1 hashCode is " + s1.hashCode());
        System.out.println("s4 hashCode is " + s4.hashCode());
    }   
}
