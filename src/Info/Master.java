package Info;

public class Master extends Student {
	private String master_speciality;

	public Master(String fullname, byte age, float average_grade,byte level,String School_name,String university_name, String speciality,String master) {
		
	super(fullname, age, average_grade, level, School_name, university_name, speciality);
	setMaster_speciality(master);
	}
	public  byte getAge() {
		return super.getAge();
	}
	public void setAge(byte age) {
		if(age >=22)
		   super.setAge(age);
	}
	public byte getLevel() {
		return super.getLevel();
	}
	public void setLevel(byte level) {
		if(level >=1 && level <= 3)
		super.setLevel(level);
	}
	public String getMaster_speciality() {
		return master_speciality;
	}
	public void setMaster_speciality(String master_speciality) {
		this.master_speciality = master_speciality;
	}
public void printInfo() {
		
		printInfo("", getUniversity_name(), getSpeciality(),getMaster_speciality());
	}
}
