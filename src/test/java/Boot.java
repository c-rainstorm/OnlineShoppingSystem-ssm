import com.github.crainstorm.oss.user.service.UserService;
import com.github.crainstorm.oss.user.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import x.y.service.Foo;
import x.y.service.FooService;

/**
 * Created by chen on 4/20/17.
 */
public class Boot {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        UserService fooService = (UserService) ctx.getBean("userServiceImpl");
        fooService.testTransaction();
    }
}