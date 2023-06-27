package FinalProject;

import java.util.Scanner;

public class Singleton {
	   // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;

    // Declaring a variable of type String
    public Student student;
    public Teacher teacher;
    public CompositeCommand compositeCommand;
    public Director director;

    public Singleton() {
        student = new Student();
        teacher = new Teacher();
        compositeCommand = new CompositeCommand();
        director = new Director();
    }

    public static Singleton getInstance() {
        if (single_instance == null) single_instance = new Singleton();
        return single_instance;
    }

    static class Process {

        void addNewStudent(int pick, Command command) {
            while (pick != 0 && pick != -2) {
                System.out.println("1. Use PerfectMathStudent Builder");
                System.out.println("2. Manual creating Student");
                System.out.println("3. Clone from an old Student");
                System.out.println("0. Exit");
                Scanner ip = new Scanner(System.in);
                pick = ip.nextInt();

                switch (pick) {
                    case 1:
                        Director director = Singleton.getInstance().director;
                        director.builder = new StudentBuilder();

                        director.perfectMathStudent();
                        Student student = (Student) director.builder.getPerson();
                        
                    	System.out.println("Set your student ID");
                        Scanner ip3 = new Scanner(System.in);
                        String id2 = ip3.nextLine();                        
                        student.setId(id2);
                        command = new AddStudentCommand(command, student);
                        command.execute();
                        System.out.println("SUCCESS added!");
                        break;

                    case 2:
                    	FactoryMethod factoryMethod = new StudentFactoryMethod();
                        Student newStudent = (Student) factoryMethod.createPerson();
                    	System.out.println("Set your student ID");
                    	Scanner ip2 = new Scanner(System.in);
                        String id1 = ip2.nextLine();
                        newStudent.setId(id1);
                        command = new AddStudentCommand(command, newStudent);
                        command.execute();
                        System.out.println("SUCCESS added!");
                        break;

                    case 3:
                        System.out.println("ID student which you want to clone");
                        Scanner ip1 = new Scanner(System.in);
                        String id = ip1.nextLine();

                        int index = -1;
                        boolean found = false;
                        System.out.println(command.list.size());
                        for (int i = 0; i < command.list.size(); i++) {
                            if (command.list.get(i).getId().equals(id)) {
                                found = true;
                                index = i;
                                break;
                            }
                        }

                        Student oldStudent = (Student) command.list.get(index);
                        if (found) {
                            student = (Student) oldStudent.clone();
//                          command.list.add(student);
                            command = new AddStudentCommand(command, student);
                            command.execute();
                            System.out.println("SUCCESS added!");
                        } else {
                            System.out.println("NOT FOUND!");

                        }
                        break;

                    default:
                        break;
                }
            }
        }

        void CRUDStudent(int pick, Command command) {
            switch (pick) {
                case 1:
                    addNewStudent(pick, command);
                    break;

                case 2:
                	System.out.println("ID student which you want to update");
                	Scanner ip1 = new Scanner(System.in);
                    String id1 = ip1.nextLine();
                    
                    Student student = new Student();
                    student.setId(id1);
                    
                    System.out.print("Update student name: ");
	                String name;
  	                Scanner na = new Scanner(System.in);
  	                name = na.nextLine();
  	                student.setName(name);
		  	        System.out.print("Update student class: ");
  	                String clss;
  	                Scanner cls = new Scanner(System.in);
  	                clss = cls.nextLine();
  	                student.setMyClass(clss);

  	                command = new UpdateStudentCommand(command, student);
  	                command.execute();
                   System.out.println("SUCCESS update!");
                    
                    
                    
                    break;
                case 3:
                    System.out.println("Enter student id which you want to remove");
                    Scanner ip = new Scanner(System.in);
                    String id = ip.nextLine();
                    command = new RemoveStudentCommand(command, id);
                    command.execute();
                    System.out.println("SUCCESS remove!");
                    break;

                default:
                    break;
            }
        }

    }
}
