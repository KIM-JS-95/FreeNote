package com.Security;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class UserTest {

    @Test
    public void getUser(){
        User user = User.builder()
                .idx(1L)
                .id("kim")
                .password("1234")
                .build();

        assertThat(user.getPassword(),is("1234"));
    }
}