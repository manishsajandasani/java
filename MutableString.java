public class MutableString {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("sb: " + sb);
        System.out.println("sb hashCode: " + sb.hashCode());
        
        sb.append(" Friend"); 
        
        System.out.println("sb: " + sb);
        System.out.println("sb hashCode: " + sb.hashCode());
    }    
}
