package icu.bleuweb.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void testCollection() {
        Collection<Integer> demo = new ArrayList<>();
        for (Integer i :
                demo) {
            System.out.println("111");
        }
    }

}
