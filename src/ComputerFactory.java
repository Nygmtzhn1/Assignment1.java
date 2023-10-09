package com.journaldev.design.factory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

// This is a factory class named "ComputerFactory" responsible for creating instances of computers.
public class ComputerFactory {

    // This is a static method that takes parameters to specify the type, RAM, HDD, and CPU of the computer.
    // It returns an instance of the specified computer type.
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            // If the type is "PC," create and return an instance of the PC class.
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            // If the type is "Server," create and return an instance of the Server class.
            return new Server(ram, hdd, cpu);
        }

        // If the type is not recognized or specified incorrectly, return null.
        return null;
    }
}
