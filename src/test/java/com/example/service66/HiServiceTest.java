package com.example.service66;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class HiServiceTest {

    @Autowired
    private HiService hiService;

    @Test
    void testSayHi() {
        System.out.println(hiService.sayHi());
    }

    @Test
    void testSayHello() {
        System.out.println(hiService.sayHello());
    }
}