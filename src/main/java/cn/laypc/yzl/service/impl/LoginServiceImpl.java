package cn.laypc.yzl.service.impl;


import cn.laypc.yzl.entity.Login;
import cn.laypc.yzl.mapper.LoginMapper;
import cn.laypc.yzl.service.ILoginService;
import cn.laypc.yzl.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YoungE
 * @since 2020-09-14
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public void add(LocalDateTime time, String address) {
        Login l = new Login();
        l.setAddress(address);
        l.setTime(time);
        loginMapper.insert(l);
    }
}