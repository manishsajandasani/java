class Student {
    int id;
    String name;
    
    Student(int i, String n) {
        id = i;
        name = n;
    }
    public int getId() {
        return id;
    }    
    public String getName() {
        return name;
    }
}

class StudentService {
    public void saveStudent(Student s) {
        System.out.println("---- Save Student ---- " + s.getName() + " " + s.getId());
    }
    
    public Student getStudent() {
        Student s = new Student(2, "Mohini");
        return s;
    }
}

public class ObjectArgumentReturn {
    public static void main(String[] args) {
        // Object as Argument
        StudentService service = new StudentService();
        service.saveStudent(new Student(1, "Manish"));
        
        // Object as Return Type
        Student s = service.getStudent();
        System.out.println("---- Get Student ---- " + s.getName() + " " + s.getId());
    }    
}
