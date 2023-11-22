package com.crm.crm.model;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class DemoLoader implements CommandLineRunner {

    private final ContactRepository repository;

    public DemoLoader(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Contact("Emmanuel", "Henri", "me@me.com"));
    }
}
