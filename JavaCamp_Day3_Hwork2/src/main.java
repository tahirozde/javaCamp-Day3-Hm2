
public class main {

	public static void main(String[] args) {
		Student student1= new Student();
		student1.setId(1);
		student1.setName("AHMET");
		student1.setLastName("YILDIRIM");
		student1.setAge(25);
		student1.setEmail("ahmet123@ymail.com");
		student1.setPercent(12);
		student1.setCourseName("Java/REACT");
		student1.setProgramsOfCourse("ÇARÞAMBA/CUMARTESÝ/21.30");
		
		Insructor instructor1=new Insructor();
		instructor1.setId(2);
		instructor1.setName("MURAT");
		instructor1.setLastName("FETHÝYE");
		instructor1.setAge(45);
		instructor1.setEmail("crazyteacher@hmail.com");
		instructor1.setAddNewCourse("C++");
		instructor1.setHomeWork("YOUTUBE 5/45 VÝDEO");
		
		User[] users = {student1,instructor1};
		
		UserManager userManager1=new UserManager();
		userManager1.add(student1);
		
				
		UserManager userManager2=new UserManager();
		userManager2.addMultiple(users);
		
		StudentManager studentManager1=new StudentManager();
		studentManager1.record(student1);
		
		StudentManager studentManager2=new StudentManager();
		studentManager2.program(student1);
		
		InsructorManager instructorManager1=new InsructorManager();
		instructorManager1.addNewHomeWork(instructor1);
		
		InsructorManager instructorManager2=new InsructorManager();
		instructorManager2.addNewCourse(instructor1);
		

	}

}
