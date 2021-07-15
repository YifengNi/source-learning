package myspringtest.mycode.impl;

import myspringtest.mycode.IUserService;
import myspringtest.mycode.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserServiceImpl
 * @Author: niyf
 * @Date: 2021/5/21 10:38
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfo userInfo;

    @Override
    public UserInfo query(Map<String, Object> reqMap) {
        return userInfo;
    }

    @Override
    public List<UserInfo> queryList(Map<String, Object> reqMap) {
        List<UserInfo> list = new ArrayList<>();
        list.add(new UserInfo("lisi", 19));
        list.add(new UserInfo("wangwu", 20));
        return list;
    }
}
