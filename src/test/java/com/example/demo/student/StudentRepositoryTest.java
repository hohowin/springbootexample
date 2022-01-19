package com.example.demo.student;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.time.Month;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldCheckIfStudentExistsEmail() {
        // given
        String email = "jamila@gmail.com";
        Student student = new Student(
                                "Jamila",
                                LocalDate.of(20005, Month.SEPTEMBER, 5),
                                email
        );
        underTest.save(student);

        // when
        boolean exists = underTest.selectExistsEmail(email);

        // then
        Assertions.assertThat(exists).isTrue();
    }

    @Test
    void itShouldCheckIfStudentEmailDoesNotExist() {
        // given
        String email = "jamila@gmail.com";

        // when
        boolean exists = underTest.selectExistsEmail(email);

        // then
        Assertions.assertThat(exists).isFalse();
    }
}