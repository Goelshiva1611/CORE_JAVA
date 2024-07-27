
class student1 {

    int studentId;
    String studentName;
    String studentcity;

    public void study() {
        System.out.println("Student Name : " + studentName);
    }

    public void fullinfo() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Name : " + studentcity);
        System.out.println("Student Name : " + studentId);
    }

    public static void main(String[] args) {
        student1 s1;
        s1 = new student1();
        s1.studentcity = "New Delhi";
        s1.studentId = 102203450;
        s1.studentName = "Shivansh goel";
        s1.study();
        s1.fullinfo();
    }

}
