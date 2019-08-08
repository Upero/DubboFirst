package cn.service;

import cn.springb.UserDao.UserDao;
import cn.springb.UserService.UserService;
import cn.springb.userBean.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Reference
    UserDao userDao;

    @Override
    public User FindById(Integer id) {
        return userDao.FindById(1);
    }
}
