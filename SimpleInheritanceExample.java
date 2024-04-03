class AnimalSimpleInheritance {
    private String name;
    void eat() {
        System.out.println("Animal Eating ... " + this.name);
    }
    void run() {
        System.out.println("Animal Running ... " + this.name);
    }
}

class DogSimpleInheritance extends AnimalSimpleInheritance {
    void bark() {
        System.out.println("Dog Barking ...");
    }
}

class CatSimpleInheritance extends AnimalSimpleInheritance {
    void bite() {
        System.out.println("Cat Biting ...");
    }
}

public class SimpleInheritanceExample {
    public static void main(String[] args) {
        // Specialization Technique (Moving Downwards)
        DogSimpleInheritance d = new DogSimpleInheritance();
        d.run(); // inherited : reused
        d.eat(); // inherited : reused
        d.bark(); // own : extended (newly added)
        
        System.out.println("");
        
        CatSimpleInheritance c = new CatSimpleInheritance();
        c.run(); // inherited : reused
        c.eat(); // inherited : reused
        c.bite(); // own : extended (newly added)
    }    
}
