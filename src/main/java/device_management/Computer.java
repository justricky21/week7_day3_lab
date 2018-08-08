package device_management;

import behaviours.IInput;
import behaviours.IOutput;

import java.util.ArrayList;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput outputDevice;

    private IInput inputDevice;

    private String dataStream;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
        this.dataStream = null;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice){
        this.outputDevice = outputDevice;
    }

    public IInput getInputDevice() {
        return inputDevice;
    }

    public void setInputDevice(IInput inputDevice) {
        this.inputDevice = inputDevice;
    }

    public String inputData(){
        this.dataStream = this.inputDevice.sendData();
        return this.inputDevice.sendData();
    }

    public String outputDataStream(){
        return this.outputDevice.outputData(this.dataStream);
    }

    public String getDataStream() {
        return dataStream;
    }
}


