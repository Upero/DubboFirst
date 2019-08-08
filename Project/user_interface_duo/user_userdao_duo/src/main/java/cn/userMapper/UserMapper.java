package cn.userMapper;

import cn.springb.userBean.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    User FindById(Integer id);
}
