package myspringtest.mycode.impl;

import myspringtest.mycode.IUserService;
import myspringtest.mycode.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: UserConfiger
 * @Author: niyf
 * @Date: 2021/5/21 10:42
 * @Description:
 */
@Configuration
public class UserConfig {

    @Bean
    public UserInfo userInfo() {
        return new UserInfo("zhangsan", 18);
    }

    @Bean
    public IUserService userService() {
        return new UserServiceImpl();
    }
}
