package com.journaldev.design.test;

import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

// This is a test class named "TestFactory" to demonstrate the use of the ComputerFactory.
public class TestFactory {

    public static void main(String[] args) {

        // Use the ComputerFactory to create a PC instance with specified specifications.
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");

        // Use the ComputerFactory to create a Server instance with specified specifications.
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        // Print the configurations of the created PC and Server instances.
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
