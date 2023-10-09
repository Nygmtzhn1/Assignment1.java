package com.journaldev.design.model;
public class PC extends Computer {

    // These are instance variables that store the specifications of the PC.
    private String ram; // Stores RAM information.
    private String hdd; // Stores HDD information.
    private String cpu; // Stores CPU information.

    // This is a constructor for the PC class that takes RAM, HDD, and CPU as parameters.
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // This method overrides the abstract method getRAM() defined in the Computer class.
    // It returns the RAM information for this PC.
    @Override
    public String getRAM() {
        return this.ram;
    }

    // This method overrides the abstract method getHDD() defined in the Computer class.
    // It returns the HDD information for this PC.
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // This method overrides the abstract method getCPU() defined in the Computer class.
    // It returns the CPU information for this PC.
    @Override
    public String getCPU() {
        return this.cpu;
    }
}


