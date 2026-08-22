public class Student {

    // Instance fields
    String name;
    int attendance;

    // Static fields
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    // Constructor
    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    // Static method
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ravi", 85);
        Student s2 = new Student("Anitha", 92);

        // Call through class name
        Student.printCollegeInfo();
    }
}