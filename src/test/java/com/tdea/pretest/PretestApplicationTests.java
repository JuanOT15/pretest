package com.tdea.pretest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertFalse;
=======
import static org.junit.jupiter.api.Assertions.assertTrue;

>>>>>>> c7bf2eeb74fc1b596b6e942b83ab318f944a3191

class PretestApplicationTests {

    @Test
<<<<<<< HEAD
    public void isPasswordEqual() {

        String dbPassword = "liah";
        String password = "Liah";
=======
    void contextLoads() {
        String dbPassword = "si";
        String password = "si";
        UserUtils userUtils = new UserUtils();
        assertTrue(userUtils.isPasswordEqual(dbPassword, password));

    }
>>>>>>> c7bf2eeb74fc1b596b6e942b83ab318f944a3191

        boolean result = UserUtils.isPasswordEqual(dbPassword, password);

        assertFalse(result);
    }
}
