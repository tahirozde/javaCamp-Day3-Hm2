
public class UserManager {
	public void add(User users) {
		System.out.println(users.getName()+"adl� kullan�c� sisteme eklenmi�tir");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			System.out.println(user.getName()+"isimili kullan�c�lar sisteme eklendi");
		}
	}
	public void delete(User users) {
		System.out.println(users.getName()+"adl� kullan�c� sistemden silinmi�tir");
	}
	public void deleteMultiple(User[] users) {
		    for(User user :users) {
		    	System.out.println(user.getName()+"adl� kuulan�c�lar sistemden silinmi�tir");
		    }
	}

}
