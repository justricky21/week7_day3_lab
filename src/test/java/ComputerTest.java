import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse(2, true);
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasMonitor() {
        assertEquals(monitor, computer.getOutputDevice());
    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void hasMouse() {
        assertEquals(mouse, computer.getInputDevice());
    }

    @Test
    public void canInputMouseData(){
        assertEquals("Click!", computer.inputData());
    }


    @Test
    public void canSetInputDevice(){
        keyboard = new Keyboard("QWERTY");
        computer.setInputDevice(keyboard);
        assertEquals(keyboard, computer.getInputDevice());
    }


    @Test
    public void canInputKeyboardData(){
        keyboard = new Keyboard("QWERTY");
        computer.setInputDevice(keyboard);
        assertEquals("Tec tec tec!", computer.inputData());
    }

    @Test
    public void canSaveDataToDataStream(){
        computer.inputData();
        assertEquals("Click!", computer.getDataStream());
    }

    @Test
    public void canOutputDataStream(){
        computer.inputData();
        assertEquals("Click! is now on screen", computer.outputDataStream());
    }

}
