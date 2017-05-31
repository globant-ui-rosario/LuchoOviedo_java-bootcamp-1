package keysFourToSeven;

public interface UserService {

	public User createUser(String userName,String passWord,int dni);

	public User getUser(int userId);

	public void updateUser(User user);

	public void deleteUser(User user);

	public void uploadPhoto(User user,Photo photo);

	public void addFriend(User user,User friend);

	public void addLikeToPhoto(User user);

}
