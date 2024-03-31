public class StringOperations {
    public static void main(String[] args) {
        /**
        * Each character in java takes 2 bytes.
        * Any operation we perform on a string object, we get a new object. String is immutable in java.
        * 
        * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
        */ 
        
        String s = "Hello World";
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Character At Index: " + s.charAt(s.length() - 1));
        System.out.println("First Index of Character o: " + s.indexOf('o'));
        System.out.println("Last Index of Character o: " + s.lastIndexOf('o'));
        System.out.println("substring 6 till end: " + s.substring(6));
        System.out.println("substring: " + s.substring(6, 9));  // it excludes last index. (n to m-1)
        System.out.println("replace: " + s.replace('o', 'A'));
        System.out.println("concat: " + s.concat(". Welcome to Java."));

        String s2 = "AA,BB,CC,DD,EE";
        String[] arr = s2.split(",");
        // forEach Loop
        for(String p : arr) {
            System.out.println("split: " + p);
        }
        
        String s3 = "";
        String s4 = "               Manish ";
        System.out.println("s3 value: " + s3);
        System.out.println("is s3 empty string: " + s3.isEmpty());
        System.out.println("is s4 empty string: " + s4.isEmpty());
        System.out.println("s3 empty string length: " + s3.length());
        System.out.println("without trim: " + s4);
        System.out.println("trim: " + s4.trim());
        System.out.println("contains World: " + s.contains("World"));  // contains is case sensitive
        System.out.println("contains world: " + s.contains("world"));
        System.out.println("contains Manish: " + s.contains("Manish"));
        System.out.println("startsWith H: " + s.startsWith("H"));
        System.out.println("startsWith Hello: " + s.startsWith("Hello"));
        System.out.println("endsWith rld: " + s.endsWith("rld"));
        
        String s5 = null;   // null means memory is not assigned yet
        System.out.println("s5 value: " + s5);
        System.out.println("s3 empty == s5 null: " + (s3 == s5));
        
        // Null Pointer Exception
        // System.out.println("operations on null s5: " + s5.toLowerCase());
        
        System.out.println("original string remains same: " + s);
    }    
}
