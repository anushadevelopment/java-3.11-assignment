package sg.edu.ntu.javaspringtdd314;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoServiceTest {
    DemoService demoService;

    @BeforeEach
    public void init() {
        System.out.println("Before each test");
        demoService = new DemoService();
    }


    @Test
    public void testAdd() {
        // Setup

        // define expected result
        // int expectedResult = 8;

        // // Execute
        // int actualResult = demoService.add(3,5);

        // Assert 
        assertEquals(8, demoService.add(3,5), "3 + 5 should be 8.");
    }

    @Test 
    public void testSubtract() {
        // setup
        int expectedResult = 2;

        // execute
        int actualResult = demoService.subtract(5, 3);

        // Assert
        assertEquals(expectedResult, actualResult, "5 - 3 should be 2.");
    }

    @Test
    public void testMultiply() {
        // Setup
        int expectedResult = 15;
        
        // Execute
        int actualResult = demoService.multiply(3, 5);
        assertEquals(expectedResult, actualResult, "3*5 should be 15");
        // assertThrows(AruthmeticException.class, null);
    }

    @Test
    public void testDivide(){
        int expectedResult = 3;
        int actualResult = demoService.divide(15,5);
        assertEquals(expectedResult, actualResult, "15 / 5 should be 3");
    }

    @Test
    public void testEven(){
        int expectedResult = 0;
        boolean actualResult = demoService.isEven(20);
        assertEquals(expectedResult, actualResult, "20 % 2 should be 0");
        assertThrows(ArithmeticException.class, () -> demoService.isEven(20));
    }

     @Test
    public void testIsEven() {
        assertTrue(demoService.isEven(10021202));
        assertFalse(demoService.isEven(8293));
    }
}

