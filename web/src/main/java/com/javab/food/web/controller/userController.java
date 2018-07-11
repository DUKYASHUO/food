package com.javab.food.web.controller;

import com.javab.food.dao.dataobject.UserDo;
import com.javab.food.dao.dataobject.UserDoExample;
import com.javab.food.dao.mapper.UserDoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    private UserDoMapper mapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String sayHello() {
        return "HelloWorld";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    List<UserDo> test() {
        UserDoExample example = new UserDoExample();
        UserDoExample.Criteria criteria = example.createCriteria();
        return mapper.selectByExample(example);
    }
}
