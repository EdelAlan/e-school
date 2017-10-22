package com.alan;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alan.model.Student;

@MappedTypes(Student.class)
@MapperScan("com.alan.mapper")
@SpringBootApplication
public class ESchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ESchoolApplication.class, args);
	}
}
