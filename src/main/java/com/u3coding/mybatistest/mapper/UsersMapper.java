package com.u3coding.mybatistest.mapper;

import com.u3coding.mybatistest.model.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UsersMapper {
    List<Users> findAll();
    Users findOne();
}
