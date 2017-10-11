package com.u3coding.mybatistest.resources;

import com.u3coding.mybatistest.mapper.UsersMapper;
import com.u3coding.mybatistest.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reset/users")
public class UsersResources {
    private UsersMapper usersMapper;
    public UsersResources(UsersMapper mapper){
        this.usersMapper = mapper;
    }
    @GetMapping("/all")
    public List<Users> getAll(){
        return  usersMapper.findAll();
    }
    @GetMapping("/one")
    public Users getone(){
        return  usersMapper.findOne();
    }
}
