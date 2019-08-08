package cn.springb.UserDao;

import cn.springb.userBean.User;

public interface UserDao {
    User FindById(Integer id);
}
