
public class StudentManager extends UserManager {
	public void record(Student student) {
		System.out.println(student.getCourseName()+"adlı kursa kaydınız yapılımıştır");
	};
	public void signOut(Student student) {
		System.out.println("Hesabından çıkış yapıldı "+student.getName()+"Hoşçakal");
		
	}
	public void program(Student student) {
		System.out.println(student.getCourseName()+"kursuna kayıt oldunuz"+"Kurs programı ve ödevleri şu şekildedir      :"+student.getProgramsOfCourse());
	}
}

