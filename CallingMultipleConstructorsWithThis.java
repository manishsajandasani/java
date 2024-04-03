class NewPoint {
    private int x; 
    private int y;
        
    // Def Constructor to create def values for x and y
    NewPoint() {
        this(1,1);
        System.out.println("==== Def Constructor NewPoint() ====");
    }
    
    // Param Constructor to create user given values for x and y
    NewPoint(int x, int y) {
        this.x = x;
        this.y = y;        
        System.out.println("==== Param Constructor NewPoint(x, y) ====");
    }
    
    // Param Constructor to copy existing object's values into new object
    NewPoint(NewPoint p) {
        this(p.x, p.y);        
        System.out.println("==== Param Constructor NewPoint(NewPoint p) ====");
    }
    
    void printCoordinates() {
        System.out.println("X : " + this.x + " & Y : " + this.y);
    }
}

public class CallingMultipleConstructorsWithThis {
    public static void main(String[] args) {
        NewPoint p1 = new NewPoint();
        p1.printCoordinates();
        
        NewPoint p2 = new NewPoint(10,20);
        p2.printCoordinates();
        
        NewPoint p3 = new NewPoint(p2);
        p3.printCoordinates();
    }    
}
