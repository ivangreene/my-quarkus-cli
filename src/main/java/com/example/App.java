package com.example;

import io.quarkus.runtime.QuarkusApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App implements QuarkusApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    @Override
    public int run(String... args) throws Exception {
        while (true) {
            LOGGER.info("Sleeping for 1s...");
            Thread.sleep(1000);
        }
    }
}
