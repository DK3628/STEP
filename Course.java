import java.util.Scanner;

public class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    // Constructor with lab credits
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // Constructor for theory-only course
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Theory-only course
        String code1 = sc.nextLine();
        String title1 = sc.nextLine();
        int credits1 = sc.nextInt();
        sc.nextLine();

        // Course with lab
        String code2 = sc.nextLine();
        String title2 = sc.nextLine();
        int credits2 = sc.nextInt();
        int labCredits2 = sc.nextInt();

        Course c1 = new Course(code1, title1, credits1);
        Course c2 = new Course(code2, title2, credits2, labCredits2);

        System.out.println(c1.code + " total credits: " + c1.totalCredits());
        System.out.println(c2.code + " total credits: " + c2.totalCredits());

        sc.close();
    }
}