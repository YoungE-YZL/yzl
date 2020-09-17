package cn.laypc.yzl.controller;

import cn.laypc.yzl.service.ILoginService;

import cn.laypc.yzl.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 * ${tablecomment}  前端控制器
 * </p>
 *
 * @author YoungE
 * @since 2020-09-14
 */
@RestController
@RequestMapping(value = "login")
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private ILoginService loginService;

    @GetMapping("add")
    public Result add(String address){
        System.err.println(address);
        loginService.add(LocalDateTime.now(),address);
        return new Result(2000,"OK");
    }


}