package FinalProject;

public class StudentFactoryMethod extends FactoryMethod {

    @Override
    Person createPerson() {
        return new Student();
    }
}
