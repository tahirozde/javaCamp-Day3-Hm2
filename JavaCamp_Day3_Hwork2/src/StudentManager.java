
public class StudentManager extends UserManager {
	public void record(Student student) {
		System.out.println(student.getCourseName()+"adl� kursa kayd�n�z yap�l�m��t�r");
	};
	public void signOut(Student student) {
		System.out.println("Hesab�ndan ��k�� yap�ld� "+student.getName()+"Ho��akal");
		
	}
	public void program(Student student) {
		System.out.println(student.getCourseName()+"kursuna kay�t oldunuz"+"Kurs program� ve �devleri �u �ekildedir      :"+student.getProgramsOfCourse());
	}
}

