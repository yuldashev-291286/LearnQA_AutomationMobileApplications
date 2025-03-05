import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber(){

        assertEquals(14, this.mainClass.getLocalNumber(), "Возвращаемое число не равно 14");


    }
}
