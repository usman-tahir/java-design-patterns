
public class TestComputerFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "2GB", "500GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server", "16GB", "1TB", "2.9 GHz");

        System.out.println("Factory PC config: " + pc.toString());
        System.out.println("Factory Server config: " + server.toString());
    }
}