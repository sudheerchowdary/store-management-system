package com.cox.automotive.storemanagementsystem;

import com.cox.automotive.storemanagementsystem.service.StoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class StoreManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreManagementSystemApplication.class, args);
    }

    @Autowired
    private StoresService storesService;


    @PostConstruct
    private void init() throws IOException, InterruptedException {
        try (InputStream inputStream = getClass().getResourceAsStream("/stores.json")) {
            this.storesService.loadJson(inputStream);
        }
    }
}
