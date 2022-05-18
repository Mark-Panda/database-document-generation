package com.linhai;

import com.linhai.core.Generation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class DatabaseDocumentGenerationApplication implements CommandLineRunner {
    @Resource private Generation generation;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDocumentGenerationApplication.class, args);
    }

    @Override
    public void run(String... args) {
        generation.run();
    }
}
