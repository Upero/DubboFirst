package Springbbo.UserDaoImpl;

import Springb.Dubbo.Bean.User;
import Springb.Dubbo.Interface.UserDao;
import Springbbo.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    UserMapper userMapper;

    @Override
    public User FindById(Integer id) {
        return userMapper.FindById(id);
    }
}
