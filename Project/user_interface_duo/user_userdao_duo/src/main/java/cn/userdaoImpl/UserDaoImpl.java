package cn.userdaoImpl;

import cn.springb.UserDao.UserDao;
import cn.springb.userBean.User;
import cn.userMapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    UserMapper userMapper;

    @Override
    public User FindById(Integer id) {
        return userMapper.FindById(id);
    }
}
