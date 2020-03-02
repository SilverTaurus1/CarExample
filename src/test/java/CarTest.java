import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    private Car fixture;
    @Before
    public void setUp() throws Exception {
        fixture = new Car();
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void drive() {
        String result = fixture.drive(1, 2);
        assertEquals(result, "You managed to avoid a crash");
    }

    @Test
    public void drive_2(){
        String result = fixture.drive(230, 1);
        assertEquals(result, "You crashed");
    }

    @Test
    public void debt(){
        fixture.drive(230, 1);
        assertEquals(1000.0, (double)fixture.getDebt(), 0.1);
    }

    @Test
    public void debt_2(){
        fixture.drive(10, 1);
        assertEquals(590.0, (double)fixture.getDebt(), 0.1);
    }

    @Test
    public void getDistanceCovered() {
        fixture.drive(100, 1);
        Integer distance = fixture.getDistanceCovered();
        assertEquals(100.0, (double)distance, 0.1);
    }

}