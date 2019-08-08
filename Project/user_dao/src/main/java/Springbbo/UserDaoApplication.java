package Springbbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("Springbbo.mapper")
public class UserDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserDaoApplication.class, args);
    }

}

