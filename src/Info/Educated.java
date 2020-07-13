package Info;

public class Educated {
	
	private String fullname; 
	private byte   age;          
    private float average_grade; 
    private byte level;
    
     public Educated() {}
     public Educated(String fullname,byte age, float average_grade,byte level) {
    	setFullname(fullname);
    	setAge(age);
    	setAverage_grade(average_grade);
    	setLevel(level);
    }
    
    public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public float getAverage_grade() {
		return average_grade;
	}
	public void setAverage_grade(float average_grade) {
		if(average_grade >= 0.0f && average_grade <= 10.0f)
		this.average_grade = average_grade;
		
	}
	public byte getLevel() {
		return level;
	}
	public void setLevel(byte level) {
		this.level = level;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public void printInfo() {
		printInfo("","","","");
	}
	   
	public void printInfo(String school,String university,String speciality,String master) {
		System.out.println("");
		System.out.println("> full name: " + fullname + "(" + age + "years" + ")\n" + "> class: " + level + "\n> grade: " + average_grade );
		if(school != "") {
		System.out.println("> School: " + school);} 
		if(university != "") {
		System.out.println("> University: " + university + "\n> Speciality: " + speciality);	
		}
		if(master != "") {
		System.out.println("> Master: " + master + "\n");}
	}
}

