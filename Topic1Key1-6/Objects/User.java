package Objects;

public class User {

	private String name, mail, password, creditNumber;

	public User() {

		name = "";
		creditNumber = "";
		mail = "";
		password = "";
	}

	public User(String name, String creditNumber, String mail, String password) {

		this.name = name;
		this.creditNumber = creditNumber;
		this.mail = mail;
		this.password = password;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}


}
