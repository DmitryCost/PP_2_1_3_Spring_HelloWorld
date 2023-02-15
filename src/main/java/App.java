import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);

        Cat beanCat = applicationContext.getBean(Cat.class);
        Cat beanCat2 = applicationContext.getBean(Cat.class);
        System.out.println("First " + (bean1 == bean2));
        System.out.println("Second " + (beanCat == beanCat2));

    }
}