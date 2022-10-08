import com.zr.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void testPointCut1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        userService.UserServiceMethodTest();
    }
    @Test
    public void checkBeanDefinition(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String s:beanDefinitionNames){
            System.out.println(s);
        }
    }
    @Test
    public void checkAOP(){

    }
}
