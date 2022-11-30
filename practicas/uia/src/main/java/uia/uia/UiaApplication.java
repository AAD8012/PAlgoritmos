package uia.uia;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uia.uia.model.Users;

@MappedTypes(Users.class)
@MapperScan("uia.uia.mapper")
@SpringBootApplication
public class UiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UiaApplication.class, args);
    }

}
