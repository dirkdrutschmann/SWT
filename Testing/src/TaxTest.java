import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TaxTest {

	private Tax tax;

    @BeforeEach                                         
    public void setUp() throws Exception {
        tax = new Tax(19);
    }

    @Test                                               
    @DisplayName("Get Tax")   
    public void testAddition() {
    	System.out.print(tax.getTax(1.99));
        assertEquals(0.32,tax.getTax(1.99), "Failed to get TAX");
    }
    
    @Test                                               
    @DisplayName("Add Tax")   
    public void testSubstraktion() {
        assertEquals(1.99,tax.addTax(1.67), "Failed to add TAX");
    }
    
    @Test                                               
    @DisplayName("Get without Tax")   
    public void testDivision() {
        assertEquals(1.67,tax.getWithoutTax(1.99), "Failed to get without TAX");
    }
    
    @Test                                               
    @DisplayName("negative price")   
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, ()->tax.getTax(-1.99));
    }
    
 
}
