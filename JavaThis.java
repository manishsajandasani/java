class Animal {
    int id;
    String name;
    
    void bark() {
        System.out.println("Animal is barking " + id + " " + name);
        System.out.println("this : " + this);
        System.out.println("this hashCode : " + this.hashCode());
    }
}

public class JavaThis {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.bark();
        System.out.println("a1 : " + a1);
        System.out.println("a1 hashCode : " + a1.hashCode());
        
        System.out.println("==============");
        
        Animal a2 = new Animal();
        a2.bark();
        System.out.println("a2 : " + a2);
        System.out.println("a2 hashCode : " + a2.hashCode());
    }    
}
