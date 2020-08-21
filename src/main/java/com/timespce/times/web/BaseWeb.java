package com.timespce.times.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BaseWeb {

    private static final Logger logger = LoggerFactory.getLogger(BaseWeb.class);

    @RequestMapping(method = RequestMethod.GET,value = "/st")
    public String str(){
        int i = 1;
        String str = "he";
        System.out.println(str);
        return str;
    }

}
