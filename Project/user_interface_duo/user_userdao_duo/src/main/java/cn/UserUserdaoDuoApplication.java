package cn;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("cn.userMapper")
public class UserUserdaoDuoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserUserdaoDuoApplication.class, args);
    }

}
