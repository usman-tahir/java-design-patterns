
public class TestAbstractComputerFactory {
    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "1TB", "2.9 GHz"));

        System.out.println("AbstractFactory PC config: " + pc.toString());
        System.out.println("AbstractFactory Server config: " + server.toString());
    }

    public static void main(String[] args) {
        testAbstractFactory();
    }
}