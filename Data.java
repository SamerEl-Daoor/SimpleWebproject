package aqarDelta;
import java.sql.* ; 


public class Data {
	
	
	public  static String DBurl , DBpass, DBuser ; 

	public java.sql.Statement  stmt  ; 

	

	public Data () {

		

		DBurl = "jdbc:mysql://localhost/aqar_db" ; 

		DBpass="20113519s" ; 

		DBuser="root" ; 

		

	}



	

public 	void AddnewUser(String user , String pass) {

	

	// @SuppressWarnings("rawtypes")

	

	try {

		

	Class.forName("com.mysql.jdbc.Driver") ; 

	//Class<?> c = Class.forName("com.mysql.jdbc.Drive");

	 Connection connect = DriverManager.getConnection(DBurl, DBuser , DBpass);

	 

	 stmt = connect.createStatement() ; 

	 

	 ResultSet rst = stmt.executeQuery("select * from aqar_db.users"); 



	 writeResultSet(rst);

	 

	// java.sql.Statement statement = connect.createStatement();

	} 

	 

	catch (SQLException | ClassNotFoundException e) {

		

		 System.out.println (e.getMessage()) ; 

	}

	 

	

	

}



private void writeResultSet(ResultSet resultSet) throws SQLException {

    // ResultSet is initially before the first data set

    while (resultSet.next()) {

        // It is possible to get the columns via name

        // also possible to get the columns via the column number

        // which starts at 1

        // e.g. resultSet.getSTring(2);

        String user = resultSet.getString("username");

        String password = resultSet.getString("password");

  

        System.out.println("User: " + user);

        System.out.println("Website: " + password);



    }

}
	
	

}
