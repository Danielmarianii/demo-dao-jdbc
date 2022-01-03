package application;

import db.DB;

public class program {

	public static void main(String[] args) {
		DB.getConnection();
		
		DB.closeConnection();
		System.out.println("done");
	}

}
