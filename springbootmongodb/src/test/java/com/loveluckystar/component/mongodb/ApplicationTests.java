package com.loveluckystar.component.mongodb;

import com.loveluckystar.component.mongodb.domain.User;
import com.loveluckystar.component.mongodb.service.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by mxy on 2017/9/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Before
    public void setUp() {
        userRepository.deleteAll();
    }
    @Test
    public void test() throws Exception {
        // 创建三个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
//        Assert.assertEquals(3, userRepository.findAll().size());
//        // 删除一个User，再验证User总数
        User u = userRepository.findOne(1L);
//        userRepository.delete(u);
//        Assert.assertEquals(2, userRepository.findAll().size());
        // 删除一个User，再验证User总数
        u = userRepository.findByAge(30);
        System.out.println(u.getId());
        u = userRepository.findById(2);
        System.out.println(u.getUsername());
    }
}
