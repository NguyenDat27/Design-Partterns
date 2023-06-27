package FinalProject;

public class Teacher extends Person implements IClone {
    String[] childrenClass;

    public Teacher() {
    }

    public Teacher(Teacher teacher) {
        super(teacher);
        this.childrenClass = teacher.childrenClass;
    }

    @Override
    public void hello() {
        System.out.println("I'm in TeacherClass");
    }

    @Override
    public Person clone() {
        return new Teacher(this);
    }

    void createStudent() {
        System.out.println("create a Student");
    }

    void updateStudent() {
        System.out.println("update a Student");
    }

    void deleteStudent() {
        System.out.println("delete a Student");
    }

    void cloneStudent() {
        System.out.println("clone a Student");
    }

}
