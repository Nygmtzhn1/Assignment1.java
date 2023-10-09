// This is a class named "Server" that extends the "Computer" abstract class.
public class Server extends Computer {

    // These are instance variables that store the specifications of the server.
    private String ram; // Stores RAM information.
    private String hdd; // Stores HDD information.
    private String cpu; // Stores CPU information.

    // This is a constructor for the Server class that takes RAM, HDD, and CPU as parameters.
    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // This method overrides the abstract method getRAM() defined in the Computer class.
    // It returns the RAM information for this server.
    @Override
    public String getRAM() {
        return this.ram;
    }

    // This method overrides the abstract method getHDD() defined in the Computer class.
    // It returns the HDD information for this server.
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // This method overrides the abstract method getCPU() defined in the Computer class.
    // It returns the CPU information for this server.
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
