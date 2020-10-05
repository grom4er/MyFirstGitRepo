package Module2.Lessons8;


import java.util.Arrays;

class Computer {

    private ComputePart[] computePart = new ComputePart[4];
    private int price;
    private ComputerDevice[] computeDevice;


    Computer(int price) {
        this.price = price;
        computePart[0] = new ComputePart("HDD");
        computePart[1] = new ComputePart("MotherBoard");
        computePart[2] = new ComputePart("CPU");
        computePart[3] = new ComputePart("Video Card");

    }


    public int getPrice() {
        return price;
    }

    Computer(int price, ComputerDevice... computeDevice) {
        super();
        this.computeDevice = computeDevice;
        computePart[0] = new ComputePart("HDD");
        computePart[1] = new ComputePart("MotherBoard");
        computePart[2] = new ComputePart("CPU");
        computePart[3] = new ComputePart("Video Card");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computePart=" + Arrays.toString(computePart) +
                ", price=" + price +
                ", computeDevice=" + Arrays.toString(computeDevice) +
                '}';
    }
}


class ComputerDevice {
    protected String device_Name;


    public ComputerDevice(String device_Name) {
        this.device_Name = device_Name;
    }


    @Override
    public String toString() {
        return "ComputerDevice{" +
                "device_Name='" + device_Name + '\'' +
                '}';
    }
}

class ComputePart {
    protected String Computer_Part;

    @Override
    public String toString() {
        return "ComputePart{" +
                "Computer_Part='" + Computer_Part + '\'' +
                '}';
    }

    public ComputePart(String computer_Part) {
        Computer_Part = computer_Part;
    }
}
