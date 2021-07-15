package myspringtest.mycode;

import myspringtest.mycode.impl.UserConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: CodeLearning
 * @Author: niyf
 * @Date: 2021/5/21 10:36
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = "myspringtest.mycode")
public class CodeLearning {

    public static void main(String[] args) {
        // annotationTest();
        // xmlLikeTest();

    }

    public static void annotationTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        IUserService userService = context.getBean(IUserService.class);
        System.out.println(userService.query(null));
        System.out.println(userService.queryList(null));
    }

    public static void xmlLikeTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        IUserService userService = context.getBean(IUserService.class);
        System.out.println(userService.query(null));
        System.out.println(userService.queryList(null));
    }

}
