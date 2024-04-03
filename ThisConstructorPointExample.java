class Point {
    private int x; 
    private int y;
    
    // setter methods
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    // Def Constructor to create def values for x and y
    Point() {
        this.x = 1;
        this.y = 1;
    }
    
    // Param Constructor to create user given values for x and y
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Param Constructor to copy existing object's values into new object
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    void printCoordinates() {
        System.out.println("X : " + this.x + " & Y : " + this.y);
    }
}

public class ThisConstructorPointExample {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.printCoordinates();
        
        System.out.println("================");
        
        Point p2 = new Point(10, 20);
        p2.printCoordinates();
        
        System.out.println("================");
        
        Point p3 = new Point(p2);
        p3.printCoordinates();
        
        System.out.println("================");
        
        Point p4 = p3;
        p4.printCoordinates();
        
        System.out.println("================");
        
        System.out.println("P1 hashCode is " + p1.hashCode());
        System.out.println("P2 hashCode is " + p2.hashCode());
        System.out.println("P3 hashCode is " + p3.hashCode());
        System.out.println("P4 hashCode is " + p4.hashCode());
        
        System.out.println("================");
        
        // Modify values of x and y by p4 object, will change values for p3 object 
        // as both are pointing to the same object (because we copied p3 to p4)
        p4.setX(101);
        p4.setY(102);
        p3.printCoordinates();
        p4.printCoordinates();
    }    
}
