class Student {
    int roll;
    String name;
    int[] marks = new int[5];

    
    public Student() {
        this.roll = 0;
        this.name = "Unknown";
        for (int i = 0; i < 5; i++) {
            this.marks[i] = 0;
        }
    }

    
    public Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks.length == 5 ? marks : new int[5];
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

public class lab4_3 {
    public static void main(String[] args) {
        
        Student student1 = new Student(); 
        Student student2 = new Student(8, "Affan", new int[]{85, 92, 76, 81, 90}); 

        
        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println("Student 2 Details:");
        student2.display();
    }
}
