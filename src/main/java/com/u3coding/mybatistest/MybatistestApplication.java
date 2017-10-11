package com.u3coding.mybatistest;

import com.u3coding.mybatistest.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.u3coding.mybatistest.mapper")
@SpringBootApplication
public class MybatistestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatistestApplication.class, args);
	}
}
