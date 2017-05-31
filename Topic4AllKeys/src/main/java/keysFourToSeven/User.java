package keysFourToSeven;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userName;
	private String passWord;
	private int dni;
	private Photo photo;
	private List<User> friends;

	public User(String userName, String passWord, int dni) {
		this.userName = userName;
		this.passWord = passWord;
		this.dni = dni;
		friends = new ArrayList<User>();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getUserId() {
		return dni;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public void addFriend(User user) {
		friends.add(user);
	}

	public User getFriend(User friend) {
		User friendWanted = null;
		for (User friendList : friends) {
			if (friendList.getUserId() == friend.getUserId()) {
				friendWanted = friendList;
				break;
			}
		}
		return friendWanted;
	}

}
