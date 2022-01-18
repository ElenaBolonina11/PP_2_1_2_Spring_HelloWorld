import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean2 =
                (HelloWorld) applicationContext2.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println(bean==bean2);
        //ВОПРОС: Почему если сравнивать по ссылке бины HelloWorld - false, не смотря на @Scope("singleton")?
        ApplicationContext applicationContextCat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat =
                (Cat) applicationContextCat.getBean("Meow");
        System.out.println(beanCat.getMessage());

        ApplicationContext applicationContextCat2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat2 =
                (Cat) applicationContextCat2.getBean("Meow");
        System.out.println(beanCat2.getMessage());
        System.out.println(beanCat==beanCat2);
    }
}