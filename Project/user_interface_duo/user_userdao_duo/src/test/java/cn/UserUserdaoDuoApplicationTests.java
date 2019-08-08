package cn;

import cn.springb.UserDao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserUserdaoDuoApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    public void findbyid() {
        System.out.println(userDao.FindById(2));
    }
}
