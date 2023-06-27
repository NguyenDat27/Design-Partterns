package FinalProject;

public class StudentBuilder implements Builder {
	Student student;

    @Override
    public void reset() {
        this.student = new Student();
    }

    @Override
    public void setType(Type type) {
        student.setType(type);

    }

    @Override
    public void setPosition(String position) {
        student.setPosition(position);
    }

    @Override
    public void setTalent(String talent) {
        student.setTalent(talent);
    }

    @Override
    public Person getPerson() {
        return this.student;
    }

    void setMyClass(String myClass) {
        student.setMyClass(myClass);
    }
}
