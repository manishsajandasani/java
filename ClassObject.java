class Dog {
    /**
    * Properties
    */
    int age;
    String name;

    /**
     * Methods
     */
    void eat() {
        System.out.println("Dog " + name + " is eating and it's age is " + age);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        /**
         * Default value of String is null
         * Default value of Integer is 0
         */
        
        Dog d1;  // reference only, not an object
        d1 = new Dog();  // create object
        d1.eat();
        
        Dog d2 = new Dog();
        d2.age = 10;
        d2.name = "Bunny";
        d2.eat();
        
        Dog d3 = d2;  // assign reference of d2 to d3
        d3.eat();
        
        System.out.println("d1 hashCode is " + d1.hashCode());
        System.out.println("d2 hashCode is " + d2.hashCode());
        System.out.println("d3 hashCode is " + d3.hashCode());
    }    
}
