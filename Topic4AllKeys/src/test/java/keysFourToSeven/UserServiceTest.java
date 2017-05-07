package keysFourToSeven;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserServiceTest {

	@Test
	public void testCreateAndGetUser() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("luciano", "asd", 36004261);
		assertEquals(user, userService.getUser(user.getUserId()));
	}

	@Test
	public void testUpdateUser() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("luciano", "asd", 36004261);
		user.setPassWord("qwe");
		userService.updateUser(user);
		assertEquals(user.getPassWord(), userService.getUser(user.getUserId()).getPassWord());
	}

	@Test
	public void testDeleteUser() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("luciano", "asd", 36004261);
		userService.deleteUser(user);
		assertEquals(userService.getUser(user.getUserId()), null);
	}

	@Test
	public void testUploadPhoto() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("luciano", "asd", 36004261);
		Photo photo = new Photo(5);
		userService.uploadPhoto(user, photo);
		assertEquals(userService.getUser(user.getUserId()).getPhoto(), photo);
	}

	@Test
	public void testAddFriends() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("luciano", "asd", 36004261);
		User friend1 = userService.createUser("pedro", "ghj", 33123567);
		User friend2 = userService.createUser("roberto", "bnm", 4);
		userService.addFriend(user, friend1);
		userService.addFriend(user, friend2);
		assertEquals(friend1, userService.getUser(user.getUserId()).getFriend(friend1));
		assertEquals(friend2, userService.getUser(user.getUserId()).getFriend(friend2));
	}

	@Test
	public void testAddLikesToPhotos() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("luciano", "asd", 36004261);
		Photo photo = new Photo(5);
		userService.uploadPhoto(user, photo);
		userService.addLikeToPhoto(user);
		assertEquals(new Integer(1), new Integer(userService.getUser(user.getUserId()).getPhoto().getLikes()));
		userService.addLikeToPhoto(user);
		assertEquals(new Integer(2), new Integer(userService.getUser(user.getUserId()).getPhoto().getLikes()));
		userService.addLikeToPhoto(user);
		assertEquals(new Integer(3), new Integer(userService.getUser(user.getUserId()).getPhoto().getLikes()));
	}

}
