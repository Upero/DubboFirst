package Springb.Dubbo.Interface;

import Springb.Dubbo.Bean.User;

public interface UserDao {
    User FindById(Integer id);
}
