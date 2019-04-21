package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoCtrl {

    @RequestMapping(value="/health",method = RequestMethod.GET)
    public @ResponseBody DemoEntity health(){
        System.out.println("coming .....");
        DemoEntity entity = new DemoEntity();
        entity.setDate(new Date());
        entity.setInfo("this is info");
        entity.setVersion("version:1.0.1");

        return entity;
    }

}
