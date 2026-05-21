package com.konezocorp.course.config;

import com.konezocorp.course.entities.User;
import com.konezocorp.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "marisa","mariss@gmail.com","3547478","84787387");
        User u2 = new User(null, "sabris","sariss@gmail.com","3947478","84787087");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
