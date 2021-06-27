import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VerlagshausTest {

	private Tax tax;

    @BeforeEach                                         
    public void setUp() throws Exception {
        tax = new Tax(19);
    }
}