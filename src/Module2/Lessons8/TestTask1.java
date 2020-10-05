package Module2.Lessons8;

public class TestTask1 {
    public static void main(String[] args) {
        Computer computer = new Computer(4000);
        System.out.println(computer.toString());
        ComputerDevice mouse = new ComputerDevice("Mouse");
        ComputerDevice keyboard = new ComputerDevice("Keyboard");
        Computer computer1 = new Computer(5000, mouse,keyboard);
        System.out.println(computer1);
    }
}
