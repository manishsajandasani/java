class Dog {
    private int age;
    
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            String errMsg = "Wrong age for dog : " + age;
            throw new IllegalArgumentException(errMsg);
        }
    }
    
    public int getAge() {
        return this.age;
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setAge(10);
        int dogOneAge = d1.getAge();
        System.out.println("Dog One Age is " + dogOneAge);
        
        Dog d2 = new Dog();
        d2.setAge(15);
        int dogTwoAge = d2.getAge();
        System.out.println("Dog Two Age is " + dogTwoAge);
        
        System.out.println("====== Last Line =======");
    }    
}
