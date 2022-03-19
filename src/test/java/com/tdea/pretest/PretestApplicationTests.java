package com.tdea.pretest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PretestApplicationTests {

    @Test
    void contextLoads() {
        String dbPassword = "si";
        String password = "si";
        UserUtils userUtils = new UserUtils();
        assertTrue(userUtils.isPasswordEqual(dbPassword, password));

    }

}
