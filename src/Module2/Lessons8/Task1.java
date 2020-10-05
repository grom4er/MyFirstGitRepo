package Module2.Lessons8;

import java.util.Arrays;

class Computer {
    private ComputePart computePart;
    private int price;
    private ComputerDevice[] computeDevice;

    @Override
    public String toString() {
        return "Computer{" +
                "computePart=" + computePart +
                ", price=" + price +
                ", computeDevice=" + Arrays.toString(computeDevice) +
                '}';
    }

    Computer(int price) {
        this.price = price;
        computePart = new ComputePart("MSI A88XM-E35 V2",
                "INTEL Core i9-9900K ",
                "Seagate BarraCuda HDD 2TB 7200rpm 256MB 3.5 SATA III",
                "PNY PCI-E Quadro RTX 6000 24GB DDR6");
    }


    public int getPrice() {
        return price;
    }

    Computer(int price, ComputerDevice... computeDevice) {
        this.price = price;
        this.computeDevice = computeDevice;
        computePart = new ComputePart("MSI A88XM-E35 V2",
                "INTEL Core i9-9900K ",
                "Seagate BarraCuda HDD 2TB 7200rpm 256MB 3.5 SATA III",
                "PNY PCI-E Quadro RTX 6000 24GB DDR6");
    }
}



class ComputerDevice {
    protected String device_Name;


    public ComputerDevice(String device_Name) {
        this.device_Name = device_Name;
    }

    public void setDevice_Name(String device_Name) {
        this.device_Name = device_Name;
    }

    @Override
    public String toString() {
        return "ComputeDevice{" +
                "device_Name='" + device_Name + '\'' +
                '}';
    }
}

class ComputePart {
    protected String motherboard_Name;
    protected String CPU_Name;
    protected String HDD_Name;
    protected String video_Card_Name;

    @Override
    public String toString() {
        return "ComputePart{" +
                "motherboard_Name='" + motherboard_Name + '\'' +
                ", CPU_Name='" + CPU_Name + '\'' +
                ", HDD_Name='" + HDD_Name + '\'' +
                ", video_Card_Name='" + video_Card_Name + '\'' +
                '}';
    }

    public ComputePart(String motherboard_Name, String CPU_Name, String HDD_Name, String video_Card_Name) {
        this.motherboard_Name = motherboard_Name;
        this.CPU_Name = CPU_Name;
        this.HDD_Name = HDD_Name;
        this.video_Card_Name = video_Card_Name;
    }


}
