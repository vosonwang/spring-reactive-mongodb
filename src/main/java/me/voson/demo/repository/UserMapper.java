package me.voson.demo.repository;

import me.voson.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author voson
 */
@Mapper
@Component
public interface UserMapper {
    /**
     * return an entity by its name
     *
     * @param name String
     * @return entity
     */
    @Select("SELECT * FROM user WHERE user_name = #{name}")
    @ResultMap("me.voson.demo.repository.UserMapper.User")
    User findByName(@Param("name") String name);


    /**
     * return an uuid of saved entity
     *
     * @param user User
     * @return id Long
     */
    @Insert("insert into user (user_name,email,mobile,hash_password,organization_id,role_id,create_time,update_time) " +
            "values (#{user.userName},#{user.email},#{user.mobile},#{user.hashPassword},#{user.organizationId},#{user.roleId},#{user.createTime},#{user.updateTime})")
    @SelectKey(keyColumn="id", keyProperty="id", resultType=long.class, before=false, statement="select last_insert_id()")
    Long insert(@Param("user") User user);
}
