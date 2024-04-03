class TestThis {
    // Instance Variables
    int id;
    String name;
    
    // Instance Methods    
    void testOne() {
        System.out.println("ID is " + id + " & name is " + name);
        System.out.println("ID is " + this.id + " & name is " + this.name);
        testTwo();
        this.testTwo();
    }
    
    void testTwo() {
        System.out.println("=== Test Two Method ===");
    }
}

public class ImplicitThisKeyword {
    public static void main(String[] args) {
        TestThis obj = new TestThis();
        obj.id = 1;
        obj.name = "Manish";
        obj.testOne();
    }    
}
