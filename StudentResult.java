class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Marks extends Student {
    int mark1, mark2, mark3, mark4, mark5;

    Marks(String name, int rollNo, int mark1, int mark2,
          int mark3, int mark4, int mark5) {
        super(name, rollNo);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
    }
}

class Result extends Marks {

    Result(String name, int rollNo, int mark1, int mark2,
           int mark3, int mark4, int mark5) {
        super(name, rollNo, mark1, mark2, mark3, mark4, mark5);
    }

    void displayResult() {
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Mark 1       : " + mark1);
        System.out.println("Mark 2       : " + mark2);
        System.out.println("Mark 3       : " + mark3);
        System.out.println("Mark 4       : " + mark4);
        System.out.println("Mark 5       : " + mark5);
        System.out.println("Total        : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Result student = new Result(
            "Arun", 101, 85, 90, 78, 88, 92
        );

        student.displayResult();
    }
}