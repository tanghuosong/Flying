package com.fly.heart.v1;

import com.fly.heart.service.ManagerService;
import com.fly.heart.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by tanghuosong 2017/5/31
 * description:
 **/
@Controller
@RequestMapping(value = "/v1/admin")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @RequestMapping(value = "/managerLogin",method = RequestMethod.POST)
    @ResponseBody
    Message managerLogin(String name,String password){
        return managerService.managerLogin(name,password);
    }

}
