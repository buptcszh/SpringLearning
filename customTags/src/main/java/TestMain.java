import beans.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

        People p = (People) ctx.getBean("people");

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
