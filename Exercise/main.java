import java.util.*;

class Students {
    private String name;
    private int rollNo;
    private float attendencePercentage;
    private long phNumber;
    private int totalMarks;
    private char grade;

    // Getters
    String getName() {
        return this.name;
    }

    int getRollNo() {
        return this.rollNo;
    }

    float getAttendencePercentage() {
        return this.attendencePercentage;
    }

    long getPhNumber() {
        return this.phNumber;
    }

    int getTotalMarks() {
        return this.totalMarks;
    }

    char getGrade() {
        return this.grade;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setAttendencePercentage(float percentage) {
        this.attendencePercentage = percentage;
    }

    void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    void setGrade(char grade) {
        this.grade = grade;
    }
}

public class main {

    public static Students[] orderByMarks(Students student[]) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i].getTotalMarks() > student[j].getTotalMarks()) { 
                    Students temp = student[j];
                    student[j] = student[i];
                    student[i] = temp;
                }
            }
        }
        return student;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Students student[] = new Students[4];

        for (int i = 0; i < 4; i++) {
            Students obj = new Students();
            System.out.print(i + 1 + ". Enter name: ");
            obj.setName(scan.nextLine());

            System.out.print(i + 1 + ". Enter roll number: ");
            obj.setRollNo(scan.nextInt());

            System.out.print(i + 1 + ". Enter attendance percentage: ");
            obj.setAttendencePercentage(scan.nextFloat());

            System.out.print(i + 1 + ". Enter phone number: ");
            obj.setPhNumber(scan.nextLong());

            System.out.print(i + 1 + ". Enter total marks: ");
            obj.setTotalMarks(scan.nextInt());

            scan.nextLine();
            System.out.print(i + 1 + ". Enter grade: ");
            obj.setGrade(scan.next().charAt(0));
            scan.nextLine();

            student[i] = obj;
        }

        Students orderedStudent[] = orderByMarks(student);
        System.out.println("\nStudents sorted by marks (Highest to Lowest):");
        for (Students s : orderedStudent) {
            System.out.println(s.getName() + " - Marks: " + s.getTotalMarks());
        }
        
        scan.close();
    }
}