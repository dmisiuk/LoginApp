package by.minsler.web.service;

public class LoginService {

	public boolean authenticate(String userID, String password) {
		// TODO implementation compare userID, password from database, for
		// example
		if (userID == null || userID.trim() == "") {
			return false;
		}
		return true;
	}
}
