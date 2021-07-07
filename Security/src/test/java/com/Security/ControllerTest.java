package com.Security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class ControllerTest {

    @Test
    public void BCryptPasswordEncoder() {
        // pw 강도 설정 가능 현재 16
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
        String result = encoder.encode("user");

        System.out.println("BCryptPasswordEncoder : " + result);
        assertTrue(encoder.matches("user", result));
    }


    @Test
    public void Pbkdf2PasswordEncoder() {
        Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder();
        String result = encoder.encode("user");

        System.out.println("Pbkdf2PasswordEncoder : " + result);
        assertTrue(encoder.matches("user", result));
    }


}