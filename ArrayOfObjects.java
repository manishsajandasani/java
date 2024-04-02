class Employee {
    int id;
    String name;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    void doTask() {
        System.out.println("Employee " + name + " doing some task and his ID is " + id);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[3];
        
        // Default value for reference type (object) is null
        for(int i = 0; i < empArr.length; i++) {
            System.out.println(empArr[i]);
        } 
        
        System.out.println("===================");
        
        empArr[0] = new Employee(1, "Purohit");
        empArr[1] = new Employee(2, "Rohit");
        empArr[2] = new Employee(3, "Mohit");
        
        // Iterate through array with for loop
        for(int i = 0; i < empArr.length; i++) {
            System.out.println(empArr[i]);
        }        
        
        System.out.println("===================");
        
        // Iterate through array with foreach loop
        for(Employee e : empArr) {
            e.doTask();
        }
        
        System.out.println("===================");
        
        Employee[] empArr2 = new Employee[] {
            new Employee(4, "Rummy"),
            new Employee(5, "Shummy"),
            new Employee(6, "Pummy")
        };
        
        for(Employee e : empArr2) {
            e.doTask();
        }
    }    
}
