package com.example.reto3ciclo4;

import com.example.reto3ciclo4.interfaces.InterfaceFragance;
import com.example.reto3ciclo4.interfaces.InterfaceOrder;
import com.example.reto3ciclo4.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto3Ciclo4Application implements CommandLineRunner {
    @Autowired
    private InterfaceFragance interfaceFragance;
    @Autowired
    private InterfaceUser userInterface;
    @Autowired
    private InterfaceOrder orderInterface;

    public static void main(String[] args) {SpringApplication.run(Reto3Ciclo4Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        interfaceFragance.deleteAll();
        userInterface.deleteAll();
        orderInterface.deleteAll();
    }
}
