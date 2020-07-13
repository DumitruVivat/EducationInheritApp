package Info;

public class Pupil extends Educated {
	
private String school_name;


public Pupil() {}
public Pupil(String fullname,byte age,float average_grade,byte level, String School_name) {
	super(fullname, age, average_grade, level);
	setAge(age);
	setSchool_name(School_name);
}

public String getSchool_name() {
	return school_name;
}

public void setSchool_name(String school_name) {
	this.school_name = school_name;
}

public byte getLevel() {
	return super.getLevel();
}
public void setLevel(byte level) {
	if(level >=1 && level <= 12)
	super.setLevel(level);
}
public byte getAge() {
	return super.getAge();
}
public void setAge(byte age) {
	if(age >=6)
	super.setAge(age);
}
public void printInfo() {
	
	printInfo(getSchool_name(),"","","");
}

}
