package com.alan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.alan.model.Student;

@Mapper
public interface StudentMapper {

	@Select("select * from students")
	List<Student> getAllStudents();

	@Select("select * from students where id = #{id}")
	Student getStudent(int id);
	
	@Insert("insert into students(fullName, email) values (#{fullName},#{email})")
	void addStudent(Student student);

	@Delete("delete from students where id = #{id}")
	void deleteStudent(int id);
}
