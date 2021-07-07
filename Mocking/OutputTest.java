import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OutputTest {

	private Output output;
    private Database database;
    @BeforeEach                                         
    public void setUp() throws Exception {
        database = mock(Database.class);
	    when(database.getNameById(2)).thenReturn("Dirk");
	    Output output = new Output(database);

    }

    @Test                                               
    @DisplayName("Get Name")   
    public void testGetName() throws SQLException {
        assertEquals("Dirk",output.getNameFromDatabase(2), "Failed to get Name");
    }


}