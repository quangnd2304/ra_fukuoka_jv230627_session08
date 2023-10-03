package ra.inheritence;

public class Student extends Person{
    //Thừa hưởng các đặc điểm và hành vi của lớp cha (Person)
    //Có các đặc điểm và hành vi riêng của Student
    private float mark;
    private String studentOfClass;

    public Student() {
    }

    public Student(int id, String name, int age, boolean sex) {
        super(id, name, age, sex);
    }

    public Student(int id, String name, int age, boolean sex, float mark, String studentOfClass) {
        super(id, name, age, sex);
        this.mark = mark;
        this.studentOfClass = studentOfClass;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getStudentOfClass() {
        return studentOfClass;
    }

    public void setStudentOfClass(String studentOfClass) {
        this.studentOfClass = studentOfClass;
    }

    public void sayHelloTeacher(){
        super.sayHello();
        System.out.println("Xin chào thầy");
    }
}
