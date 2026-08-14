class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else
            return 'F';
    }

    void displayInfo() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("kanna", 269, 92);
        Student student2 = new Student("priya", 102, 78);

        student1.displayInfo();
        student2.displayInfo();
    }
}