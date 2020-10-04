package com.springboot.dao;
/**
 * @author: Weibin Ma
 * @description: REST Demo
 */
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.springboot.bean.User;

@Mapper
public interface UserDao {
	
	@Select("select * from tb_user")
	List<User> getUserList() throws Exception;
	
	@Select("<script>"
			+ "select * from tb_user where 1=1 "
			+ "<if test='username!=null'>"
			+ " and username like concat('%',#{username},'%') "
			+ "</if>"
			+ "<if test='password!=null'>"
			+ " and password like concat('%',#{password},'%')"
			+ "</if>"
			+ "</script>")
	List<User> getUserByFields(User user) throws Exception;
 	
	@Select("select * from tb_user where id=#{id}")
	User getUserById(int id) throws Exception;
	
	@Insert("insert into tb_user(username,password) values(#{username},#{password})")
	void insertUser(User user) throws Exception;
	
	@Insert("<script>"
			+ "insert into tb_user(username,password) values "
			+ "<foreach collection='users' item='item' index='index' separator=','>"
			+ " (#{item.username},#{item.password})"
			+ "</foreach>"
			+ "</script>")
	void insertMulUser(List<User> users) throws Exception;
	
	@Delete("delete from tb_user where id=#{id}")
	void delUserById(int id) throws Exception;
	
	@Delete("<script>"
			+ "<foreach collection='users' item='item' index='index' separator=','>"
			+ "delete from tb_user where id=#{item.id}"
			+ "</foreach>"
			+ "</script>")
	void delMulUser(List<Integer> users) throws Exception;
	
	@Update("update tb_user set username=#{user.username},password=#{user.password} where id=#{id}")
	void updateUserById(User user, int id) throws Exception;
	
}

