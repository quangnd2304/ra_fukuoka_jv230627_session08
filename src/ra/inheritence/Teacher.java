package ra.inheritence;

public class Teacher extends Person{
    private String subject;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, boolean sex, String subject) {
        super(id, name, age, sex);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
