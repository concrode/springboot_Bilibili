package com.example;

import com.example.pojo.Dog;
import com.example.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LagavulinApplicationTests {

    @Autowired
    private Dog dog;

    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
