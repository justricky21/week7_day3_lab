import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse(2, true);
    }

    @Test
    public void hasButtons(){
        assertEquals(2, mouse.getButtons());
    }

    @Test
    public void testIsWireless(){
        assertTrue(mouse.isWireless());
    }

    @Test
    public void canClick(){
        assertEquals("Click!", mouse.sendData());
    }
}
