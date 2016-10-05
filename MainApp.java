/**
 * Created by svadhera on 9/7/16.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Greeter obj = (Greeter) context.getBean("greeter");
        System.out.println(obj.getGreeting());
    }
}
