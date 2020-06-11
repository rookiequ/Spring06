package com.user.service.impl;

import com.user.service.AccountService;
import org.springframework.stereotype.Component;

/**
 * @author zzq
 */
@Component("accountService")
public class AccountServiceImpl implements AccountService {
    public void saveAccount() {
        //这里写一个保存日志
        System.out.println("保存一个账号信息...");
    }

    public void updateAccount(int i) {
//        int i1 = i/0;   //用于测试异常通知
        //这里写一个保存日志
        System.out.println("修改一个账号信息..."+i);
    }

    public int deleteAccount() {
        //这里写一个保存日志
        System.out.println("删除一个账号信息");
        return 1;
    }


}
