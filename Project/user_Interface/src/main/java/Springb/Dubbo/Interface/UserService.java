package Springb.Dubbo.Interface;

import Springb.Dubbo.Bean.User;

public interface UserService {
    User FindById(Integer id);
}
