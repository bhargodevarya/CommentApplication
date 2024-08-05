package com.comment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bhargodev on 05/08/24
 **/

@SpringBootApplication
public class CommentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CommentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
