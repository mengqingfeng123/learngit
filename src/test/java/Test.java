import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.choice.entity.User;
import com.choice.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类    
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})    
    
public class Test {    
    private static Logger logger = Logger.getLogger(Test.class);    
//  private ApplicationContext ac = null;    
    @Resource    
    private UserService userService = null;    
    
//  @Before    
//  public void before() {    
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");    
//      userService = (IUserService) ac.getBean("userService");    
//  }    
    
    @org.junit.Test    
    public void test1() {    
        User user = userService.getUserById(1);    
        System.out.println(user.getAge());  
    }  
}