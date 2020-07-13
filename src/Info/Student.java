package Info;

public class Student extends Pupil {
private String university_name;
private String speciality;
    
public Student() {}
public Student(String fullname, byte age, float average_grade,byte level,String School_name,String university_name, String speciality) {
	super(fullname, age, average_grade, level,School_name);
	setSpeciality(speciality);
	setUniversity_name(university_name);
}

public String getUniversity_name() {
	return university_name;
}
public void setUniversity_name(String university_name) {
	this.university_name = university_name;
}
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public byte getLevel() {
	return super.getLevel();
}
public void setLevel(byte level) {
	if(level >=1 && level <= 7)
	super.setLevel(level);
}
public  byte getAge() {
	return super.getAge();
}
public void setAge(byte age) {
	if(age >=19)
	   super.setAge(age);
}

public void printInfo() {
	printInfo(getSchool_name(), getUniversity_name(), getSpeciality(),"");
}
}
