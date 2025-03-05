import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    // В классе MainClassTest написать тест, проверяющий, что метод getLocalNumber возвращает число 14 (назвать: testGetLocalNumber).
    @Test
    public void testGetLocalNumber(){

        assertEquals(14, this.mainClass.getLocalNumber(), "Возвращаемое число не равно 14");

    }

    // В классе MainClassTest написать тест (назвать testGetClassNumber), который проверяет, что метод getClassNumber возвращает число больше 45.
    @Test
    public void testGetClassNumber(){

        assertTrue(this.mainClass.getClassNumber() > 45, "Возвращаемое число меньше 45");

    }


}
