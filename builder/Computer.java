
public class Computer {

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabledStatus(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabledStatus(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return this.HDD;
    }

    public String getRAM() {
        return this.RAM;
    }

    public boolean getGraphicsCardEnabledStatus() {
        return this.isGraphicsCardEnabled;
    }

    public boolean getBluetoothEnabledStatus() {
        return this.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "RAM: " + this.getRAM() + ", HDD: " + this.getHDD() 
            + "; Graphics card enabled: " + this.getGraphicsCardEnabledStatus() 
            + ", Bluetooth enabled: " + this.getBluetoothEnabledStatus();
    }
}