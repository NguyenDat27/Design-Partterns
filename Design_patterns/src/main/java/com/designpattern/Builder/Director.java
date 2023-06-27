package FinalProject;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director() {

    }

    void perfectMathStudent() {
        builder.reset();
        builder.setTalent("Math");
        builder.setType(Type.PERFECT);
        builder.setPosition("Student");
    }

    void mediumGeographyStudent() {
    }
    
    void mathTeacher() {
        builder.reset();
        builder.setTalent("Math");
        builder.setType(Type.PERFECT);
        builder.setPosition("Teacher");
    }
}
