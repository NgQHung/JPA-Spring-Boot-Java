package com.example.jpa;

import com.example.jpa.model.Job;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.*;
@DataJpaTest
public class TestJob {
    @Autowired private EntityManager em;

    @Test
    public void addJob(){
        Job job = Job.builder().title("java")
                .description("hello java")
                .build();
        em.persist(job);
        assertThat(job.getId()).isNotNull();
        assertThat(job.getId().toString()).hasSizeGreaterThan(10);
    }

}
