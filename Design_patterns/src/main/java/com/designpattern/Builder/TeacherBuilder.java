package FinalProject;

public class TeacherBuilder implements Builder {

    Teacher teacher;

    @Override
    public void reset() {
        this.teacher = new Teacher();
    }

    @Override
    public void setType(Type type) {
        teacher.setType(type);
    }

    @Override
    public void setPosition(String position) {
        teacher.setPosition(position);
    }

    @Override
    public void setTalent(String talent) {
        teacher.setTalent(talent);
    }

    @Override
    public Person getPerson() {
        return this.teacher;
    }

}
