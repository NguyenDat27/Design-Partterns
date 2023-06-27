package FinalProject;

public abstract class Person {

    private String id;
    private String name;
    private String position;
    private Type type;
    private String talent;
	
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getTalent() {
		return talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

    public Person(Person person) {
        super();
        this.id = person.id;
        this.name = person.name;
        this.position = person.position;
        this.type = person.type;
        this.talent = person.talent;
    }
    
    public void hello() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("type:" + type);
        System.out.println("talent:" + talent);
        System.out.println("position:" + position);
    }
}
