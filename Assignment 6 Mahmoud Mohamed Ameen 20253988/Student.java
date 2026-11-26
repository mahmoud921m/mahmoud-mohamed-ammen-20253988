public class Student {
    private String studentID;
    private String studentName;
    private double GPA;

    public Student(String studentID, String studentName, double GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public Student() {
        studentID = "000";
        studentName = "Unknown";
        GPA = 0.0;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public boolean isHonorStudent() {
        return GPA >= 3.5;
    }

    public static void main(String[] args) {
        Student s1 = new Student("101", "Ahmed", 3.2);
        Student s2 = new Student();

        s2.setGPA(3.8);

        System.out.println("Student 1:");
        System.out.println("ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("GPA: " + s1.getGPA());
        System.out.println("Honor Student: " + s1.isHonorStudent());

        System.out.println("Student 2:");
        System.out.println("ID: " + s2.getStudentID());
        System.out.println("Name: " + s2.getStudentName());
        System.out.println("GPA: " + s2.getGPA());
        System.out.println("Honor Student: " + s2.isHonorStudent());
    }
}