interface Student {
    void displayStudent();
}

interface Sports {
    void displaySports();
}

class Result implements Student, Sports {
    String name;
    int rollNo;
    int marks;
    int sportsMarks;

    Result(String name, int rollNo, int marks, int sportsMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.sportsMarks = sportsMarks;
    }

    public void displayStudent() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Academic Marks: " + marks);
    }

    public void displaySports() {
        System.out.println("Sports Marks : " + sportsMarks);
    }

    void displayResult() {
        int total = marks + sportsMarks;

        System.out.println("Total Marks  : " + total);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Result student = new Result("Arun", 101, 85, 10);

        student.displayStudent();
        student.displaySports();
        student.displayResult();
    }
}