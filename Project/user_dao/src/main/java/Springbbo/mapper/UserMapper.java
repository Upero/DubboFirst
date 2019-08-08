package Springbbo.mapper;

import Springb.Dubbo.Bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    public User FindById(@Param("id") Integer id);
}
