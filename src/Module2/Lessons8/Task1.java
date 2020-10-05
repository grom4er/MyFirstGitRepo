package Module2.Lessons8;


import java.util.Arrays;

class Computer {

    private ComputePart[] computePart;
    private int price;
    private ComputerDevice[] computeDevice;


    Computer(int price) {
        this.price = price;
        computePart = new ComputePart[]
                {new ComputePart("HDD"),
                        new ComputePart("MotherBoard"),
                        new ComputePart("CPU"),
                        new ComputePart("Video Card")};
    }


    public int getPrice() {
        return price;
    }

    Computer(int price, ComputerDevice... computeDevice) {
        this.price = price;
        this.computeDevice = computeDevice;
        computePart = new ComputePart[]
                {new ComputePart("HDD"),
                        new ComputePart("MotherBoard"),
                        new ComputePart("CPU"),
                        new ComputePart("Video Card")};
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
