
public class InsructorManager extends UserManager {
  public void login(Insructor �nstructor) {
	  System.out.println("Sisteme ho�geldin"+�nstructor.getName()+"hocam");
  };
  public void exit(Insructor instructor) {
	  System.out.println("Ho��akal�n"+instructor.getName()+"hocam");
  };
  public void addNewCourse(Insructor instructor) {
	  System.out.println(instructor.getAddNewCourse()+"Yeni kursunuz eklenmi�tir");
  };
  public void addNewHomeWork(Insructor �nstructor) {
	  System.out.println(�nstructor.getHomeWork()+"Yeni �dev eklendi");
  };
}
