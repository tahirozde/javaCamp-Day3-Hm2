
public class UserManager {
	public void add(User users) {
		System.out.println(users.getName()+"adlý kullanýcý sisteme eklenmiþtir");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			System.out.println(user.getName()+"isimili kullanýcýlar sisteme eklendi");
		}
	}
	public void delete(User users) {
		System.out.println(users.getName()+"adlý kullanýcý sistemden silinmiþtir");
	}
	public void deleteMultiple(User[] users) {
		    for(User user :users) {
		    	System.out.println(user.getName()+"adlý kuulanýcýlar sistemden silinmiþtir");
		    }
	}

}
