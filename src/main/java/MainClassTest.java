import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    // В классе MainClassTest написать тест (назвать testGetClassString), который проверяет, что метод getClassString возвращает строку, в которой есть подстрока “hello” или “Hello”, если нет ни одной из подстрок - тест падает.
    @Test
    public void testGetClassString(){

        if (this.mainClass.getClassString().contains("hello")){

            assertTrue(1 == 1);
            System.out.println("В проверяемой строке есть подстрока 'hello'");

        }else if (this.mainClass.getClassString().contains("Hello")){

            assertTrue(1 == 1);
            System.out.println("В проверяемой строке есть подстрока 'Hello'");

        }else {

            assertTrue(1 != 1, "В проверяемой строке нет строк 'hello' или 'Hello'");

        }


    }


}
