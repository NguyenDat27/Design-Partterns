package FinalProject;

public interface Builder {
	void reset();

	void setType(Type type);

	void setPosition(String position);

	void setTalent(String talent);

	Person getPerson();
}
