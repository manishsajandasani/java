class AnimalSuperInheritance {
    private String name;

    public AnimalSuperInheritance() {
        System.out.println("Animal Def. Constructor");
    } 
    
    public AnimalSuperInheritance(String name) {
        System.out.println("Animal Param. Constructor");
        this.name = name;
    } 
    
    void eat() {
        System.out.println("Animal Eating ... " + this.name);
    }
}

class DogSuperInheritance extends AnimalSuperInheritance {
    private int id; 
    
    public DogSuperInheritance() {
        System.out.println("Dog Def. Constructor");
    }
    
    public DogSuperInheritance(int id, String name) {
        super(name);
        System.out.println("Dog Param. Constructor");
        this.id = id;
    } 
    
    void bark() {
        System.out.println("Dog Barking ... " + this.id);
    }
}

public class InheritanceWithSuper {
    public static void main(String[] args) {
        DogSuperInheritance d = new DogSuperInheritance();
        d.eat(); 
        d.bark();
        
        System.out.println("******************************");
        System.out.println("******************************");
        
        DogSuperInheritance dd = new DogSuperInheritance(101, "Bridal");
        dd.eat(); 
        dd.bark();
    }    
}
