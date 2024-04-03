class ThisSetter {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}

public class ThisWithSetter {
    public static void main(String[] args) {
        ThisSetter obj = new ThisSetter();
        obj.setName("Rohit");
        System.out.println("Name is " + obj.getName());
    }    
}
