package com.ting.demo1.weixin.util;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:SheilaTing
 * @Descripton:
 * @Date:Created in $time$ $date$
 */

@RestController
public class MyController {

    @ResponseBody
    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    String home() {
        return "Hello World!";
    }
}
