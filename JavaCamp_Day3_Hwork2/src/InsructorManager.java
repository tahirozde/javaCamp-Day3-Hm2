
public class InsructorManager extends UserManager {
  public void login(Insructor Ýnstructor) {
	  System.out.println("Sisteme hoþgeldin"+Ýnstructor.getName()+"hocam");
  };
  public void exit(Insructor instructor) {
	  System.out.println("Hoþçakalýn"+instructor.getName()+"hocam");
  };
  public void addNewCourse(Insructor instructor) {
	  System.out.println(instructor.getAddNewCourse()+"Yeni kursunuz eklenmiþtir");
  };
  public void addNewHomeWork(Insructor Ýnstructor) {
	  System.out.println(Ýnstructor.getHomeWork()+"Yeni Ödev eklendi");
  };
}
