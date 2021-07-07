package de.dirk.mocking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Database {
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String pass = "swt";
    private Connection con;
    
    public Database() throws SQLException{
            this.con = DriverManager.getConnection(url, user, pass);
            System.out.println("Verbindung erfolgreich hergestellt");
     
    }

    public String getNameById(int id) throws SQLException{
    
       		Statement stm = this.con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT name FROM user WHERE id = '" + id + "';");
			return rs.getString(1);
		
    }
}
