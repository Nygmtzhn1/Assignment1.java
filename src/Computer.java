
package com.journaldev.design.model;

// This is an abstract class named "Computer" in the "com.journaldev.design.model" package.
public abstract class Computer {

    // These are abstract methods that any subclass of Computer must implement.
    // They define the properties of a computer.
    public abstract String getRAM();  // Method to get the RAM of the computer.
    public abstract String getHDD();  // Method to get the HDD of the computer.
    public abstract String getCPU();  // Method to get the CPU of the computer.

    // This is the overridden toString() method.
    // It returns a formatted string representation of a Computer object,
    // including its RAM, HDD, and CPU details.
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
