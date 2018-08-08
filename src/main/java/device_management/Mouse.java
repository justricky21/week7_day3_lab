package device_management;

import behaviours.IInput;

public class Mouse implements IInput {
    private int buttons;
    private boolean wireless;

    public Mouse(int buttons, boolean wireless) {
        this.buttons = buttons;
        this.wireless = wireless;
    }

    public int getButtons() {
        return buttons;
    }

    public boolean isWireless() {
        return wireless;
    }

    public String sendData(){
        return "Click!";
    }
}
