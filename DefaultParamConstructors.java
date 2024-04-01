class Dog {
    int age;
    String name;
    
    Dog() {
        System.out.println("===== Default Constructor =====");
        
        // In case of name (string) the default value is null given by JVM
        // Programmer gave the default value for age        
        age = 10;
    }
    
    Dog(int a, String n) {
        System.out.println("===== Parameterized Constructor =====");
        age = a;
        name = n;
    }
    
    public void eat() {
        System.out.println("Name of dog is " + name + " & it's age is " + age);
    }
}

public class DefaultParamConstructors {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        
        System.out.println("");
        
        Dog d2 = new Dog(15, "Sheru");
        d2.eat();
    }    
}
