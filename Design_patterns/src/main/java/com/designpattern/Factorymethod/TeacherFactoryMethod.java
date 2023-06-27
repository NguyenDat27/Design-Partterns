package FinalProject;

public class TeacherFactoryMethod extends FactoryMethod {

    @Override
    Person createPerson() {
        return new Teacher(null);
    }
}
