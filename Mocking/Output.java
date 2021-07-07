package de.dirk.mocking;
import java.sql.SQLException;

public class Output {

private Database database;

public Output(Database database) {
	this.database = database;
}

public Output() {
	try {
		this.database = new Database();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}

public String getNameFromDatabase(int id) throws SQLException{
    return database.getNameById(id);
}
}
