package by.minsler.web.service;

import java.util.HashMap;

import by.minsler.web.dto.User;

public class LoginService {

	private HashMap<String, String> users;

	public LoginService() {
		users = new HashMap<String, String>();
		users.put("minsler", "Dzmitry Misiuk");
		users.put("kakawi", "Gleb Bondarenko");
	}

	public boolean authenticate(String userID, String password) {
		// TODO implementation compare userID, password from database, for
		// example
		if (userID == null || userID.trim() == "" || password == null
				|| password.trim() == "") {
			return false;
		}
		return true;
	}

	public User getUser(String userID) {
		User user = new User();
		user.setUserName(users.get(userID));
		return user;
	}
}
