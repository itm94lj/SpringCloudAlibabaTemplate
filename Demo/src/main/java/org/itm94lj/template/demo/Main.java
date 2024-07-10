package org.itm94lj.template.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.itm94lj")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}