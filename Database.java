package aqarDelta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private boolean InsertUser() {
		boolean success=false;
		String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/aqar_db";
	      try {
			Class.forName(myDriver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      String localhost = null,ROOT="root",PASS="20113519sS!";
		try {
			Connection conn = DriverManager.getConnection(localhost, ROOT, PASS);
			success=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return success;
		
	}

}
