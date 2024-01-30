class Student {
    int roll;
    String name;
    int[] marks = new int[5];

    public Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks.length == 5 ? marks : new int[5];
    }

    public double avgCalc() {
        int sum = 0;
        for (int mark: marks) {
            sum += mark;
        }
        return sum / 5.0;
    }

    public void display() {
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+ roll);
        System.out.println("Average Marks: "+ avgCalc());
    }
}

public class lab4_4 {
    public static void main(String[] args) {

        Student student1 = new Student(7, "Gojo", new int[]{80, 90, 67, 78, 88});
        Student student2 = new Student(10, "Pikachu", new int[]{70, 95, 57, 88, 68});
        Student student3 = new Student(44, "Levi", new int[]{100, 90, 97, 98, 99});

        student1.display();
        student2.display();
        student3.display();
    }
}