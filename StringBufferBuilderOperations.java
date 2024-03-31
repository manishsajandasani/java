public class StringBufferBuilderOperations {
    public static void main(String[] args) {
        /**
         * When you print any object in java toString() method is called 
           internally
         * toString() method will convert StringBuilder into String
         */
        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(sb.length());
        
        String s = sb.toString();
        System.out.println("StringBuilder to String by toString(): " + s);
        
        sb.append(" Friends");
        System.out.println(sb);
        
        sb.insert(5, " Dear");
        System.out.println(sb);
        
        sb.delete(0, 6);   // it excludes last index
        System.out.println(sb);
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(5));
        System.out.println(sb.reverse());
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 4, "Hello"));  // it excludes last index
        String s1 = sb.substring(6);    // substring returns a string
        System.out.println(s1);
        String s2 = sb.substring(6, 9);    // it excludes last index
        System.out.println(s2);
    }    
}
