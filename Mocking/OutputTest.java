package de.dirk.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class OutputTest {

	
    @Test                                               
    @DisplayName("Get Name")   
    public void testGetName() throws SQLException {
    	
    	Database database = mock(Database.class);
    	when(database.getNameById(2)).thenReturn("Dirk");
    	Output output = new Output(database);
    
    
        try {
			assertEquals("Dirk",output.getNameFromDatabase(2), "Failed to get Name");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

    
 
}
