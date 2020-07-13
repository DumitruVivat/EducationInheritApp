package main;

import Info.Educated;
import Info.Master;
import Info.Pupil;
import Info.Student;

public class EducationInheritApp {

	public static void main(String[] args) {
		
		Educated educated = new Educated("John Doe Jr.", (byte)17, 9.75f, (byte)10);
		educated.printInfo();
		Pupil pupil = new Pupil("Constantin Doom", (byte)19, 7.00f, (byte)11, "Mihai Eminescu");
		pupil.printInfo();
		Student student = new Student("Eugen Pelin", (byte)25, 6.50f, (byte)4, "Vasile Alecsandri","UTM","IT");
		student.printInfo();
		Master master = new Master("Elena G.", (byte)30, 10.00f, (byte)2, "Mircea Eliade","USM","Psihologie","Psihologia administrativa");
		master.printInfo();
	}

}
