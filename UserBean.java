package aqarDelta;

public class UserBean {
	public UserBeanData data = new UserBeanData();
	//public UserBean() {
		
	//}
	public String getUsername() {
		return data.username;
	}
	public void setUsername(String username) {
		this.data.username = username;
	}
	public String getPassword() {
		return data.password;
	}
	public void setPassword(String password) {
		this.data.password = password;
	}
	public String getFirstName() {
		return data.firstName;
	}
	public void setFirstName(String firstName) {
		this.data.firstName = firstName;
	}
	public String getLastName() {
		return data.lastName;
	}
	public void setLastName(String lastName) {
		this.data.lastName = lastName;
	}
	public boolean isValid() {
		return data.isValid;
	}
	public void setValid(boolean isValid) {
		this.data.isValid = isValid;
	}

}
