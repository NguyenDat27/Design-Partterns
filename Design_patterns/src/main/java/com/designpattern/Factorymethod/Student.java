package FinalProject;

public class Student extends Person implements IClone {
	private String myClass;

    //    Getter and Setter
    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public Student() {
    }

    public Student(Student student) {
        super(student);
        this.myClass = student.myClass;
    }

    @Override
    public void hello() {
        super.hello();
        System.out.println("myClass: " + getMyClass());
    }

    @Override
    public Person clone() {
        return new Student(this);
    }
}
