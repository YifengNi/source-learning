package myspringtest.mycode;

import myspringtest.mycode.impl.UserConfigure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: CodeLearning
 * @Author: niyf
 * @Date: 2021/5/21 10:36
 * @Description:
 */
public class CodeLearning {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfigure.class);
        IUserService userService = context.getBean(IUserService.class);
        System.out.println(userService.query(null));
        System.out.println(userService.queryList(null));
    }

}
