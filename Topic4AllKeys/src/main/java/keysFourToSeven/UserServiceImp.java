package keysFourToSeven;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService {

	private List<User> users = new ArrayList<User>();

	public User createUser(String userName, String passWord, int dni) {
		User user = new User(userName, passWord, dni);
		users.add(user);
		return user;
	}

	public User getUser(int userId) {
		User userWanted = null;
		for (User userList : users) {
			if (userId == userList.getUserId()) {
				userWanted = userList;
				break;
			}
		}

		return userWanted;
	}

	public void updateUser(User userUp) {
		User userWanted = this.getUser(userUp.getUserId());
		users.remove(userWanted);
		users.add(userUp);

	}

	public void deleteUser(User userRv) {
		users.remove(userRv);

	}

	public void uploadPhoto(User user, Photo photo) {
		user.setPhoto(photo);
		this.updateUser(user);

	}

	public void addFriend(User user, User friend) {
		user.addFriend(friend);
		this.updateUser(user);

	}

	public void addLikeToPhoto(User user) {
		user.getPhoto().addLike();
		this.updateUser(user);

	}

}
