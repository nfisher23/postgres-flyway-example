package com.nickolasfisher.flywaystuff;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DevConfig.class, Migrate.class})
public class FlywaystuffApplicationTests {

    @Test
    public void contextLoads() {
    }

}
