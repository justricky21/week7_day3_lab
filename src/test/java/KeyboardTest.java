import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("QWERTY");
    }

    @Test
    public void hasType(){
        assertEquals("QWERTY", keyboard.getType());
    }

    @Test
    public void canType(){
        assertEquals("Tec tec tec!", keyboard.sendData());
    }
}