package me.voson.demo.model;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void testToString() {
        User user =new User();
        user.setUserName("voson");
        System.out.println(user.toString());
    }
}