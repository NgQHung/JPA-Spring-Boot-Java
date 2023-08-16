//package com.example.jpa;
//
//import com.example.jpa.model.Employee;
//import com.github.javafaker.Faker;
//import jakarta.persistence.EntityManager;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//@Configuration
//public class databaseInitializer {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//    @Autowired
//    private EntityManager em;
//
//    @Bean
//    CommandLineRunner initDatabase(){
//
//        return new CommandLineRunner() {
//            @Override
//            @Transactional
//            public void run(String... args) throws Exception{
////                jdbcTemplate.execute("Create table Employees(id int primary key auto_increment," +
////                        " name varchar(30), email varchar(30))");
////                jdbcTemplate.execute("INSERT INTO Employees(name,email) VALUES ('Hung Nguyen Quang','hung@hung.hung')");
////                jdbcTemplate.execute("INSERT INTO Employees(name,email) VALUES ('Minh Anh','ma@ma.ma')");
//
//                Faker faker = new Faker();
//        for(int i = 0; i < 100; i++){
//            var employer = Employee.builder().id(faker.number().randomDigit())
//                    .name(faker.name().name())
//                    .email(faker.name().name() + "@gmail.com")
//                    .build();
////            System.out.println(employer);
//            em.persist(employer);
//        }
//        em.flush();
//            }
//        };
//    }
//}
