package sba.sms.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sba.sms.models.Student;
import sba.sms.utils.CommandLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;


class StudentServiceTest {
    @BeforeAll
    public static void initializeStudents() {
        CommandLine.addData();
    }

    @ParameterizedTest
    @CsvSource({
            "reema@gmail.com, password",
            "annette@gmail.com, password",
            "anthony@gmail.com, password"
    })
    void studentCredentialsAreValid(String email, String password){
        Assertions.assertTrue(StudentService.validateStudent(email, password));
    }

;
    @ParameterizedTest
    @CsvSource({
            "wrong@email.com, password",
            "iamhungry@gmail.com, password",
            "plsfeedme@gmail.com, password"
    })
    void studentCredentialsAreNotValid(String email, String password){
        Assertions.assertFalse(StudentService.validateStudent(email, password));
    }

}

