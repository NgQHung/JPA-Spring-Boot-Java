package com.example.jpa;

import com.example.jpa.model.Employee;
import com.example.jpa.model.Job;
import com.github.javafaker.Faker;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
    @Autowired
    private EntityManager em;
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        for(int i = 0; i < 100; i++){
            var job = Job.builder()
                    // the reason why there is no id
//                  // is that id is generated automatically
                    // so no need to create here. can cause error
                    .title(faker.name().name())
                    .description(faker.name().fullName())
                    .build();
            var employer = Employee.builder()
                    .name(faker.name().name())
                    .email(faker.name().fullName())
                    .build();
            em.persist(employer);
        }
        em.flush();
    }
}
