class ThisConstructor {
    private int id;
    private String name;
    
    ThisConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getId() {
        return this.id;
    }
}

public class ThishWithConstructor {
    public static void main(String[] args) {
        ThisConstructor obj = new ThisConstructor(101, "Honey");
        System.out.println("Name is " + obj.getName() + " & ID is " + obj.getId());
    }      
}
