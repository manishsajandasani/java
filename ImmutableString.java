public class ImmutableString {
    public static void main(StringBasics[] args) {
        /**
         * String is immutable in Java
         * Why Strings are Immutable in Java? Answer is String Literal Pooling
         * https://www.javatpoint.com/string-pool-in-java
         * https://www.javaranch.com/journal/200409/ScjpTipLine-StringsLiterally.html
         */
        
        String s1 = "Hello";
        String s2 = " Friends";
        
        // Concate Operation
        System.out.println(s1);
        System.out.println(s1.hashCode());
        
        s1 = s1 + s2;   // trying to modify
        
        // A new object in the memory is created with the modified value
        // We can see earlier the hashCode of variable s1 is different and now is different
        System.out.println(s1);
        System.out.println(s1.hashCode());
        
        // If the changes are applied in the same memory location then it is called mutabiltiy 
    }    
}
