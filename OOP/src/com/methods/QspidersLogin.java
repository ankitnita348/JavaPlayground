package com.methods;

public class QspidersLogin {

	public static boolean login(String username, int password) {
		if (username.equals("Qspiders") && password == 5454) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(login("Qspiders", 5454));
		System.out.println(login("Qspiders", 5353));

	}

}
