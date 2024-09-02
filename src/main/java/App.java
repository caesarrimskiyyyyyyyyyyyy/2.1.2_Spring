import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld firstHelloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondHelloWorld = (HelloWorld) applicationContext.getBean("helloworld");

        Cat firstCatBean = (Cat) applicationContext.getBean("cat");
        Cat secondCatBean = (Cat) applicationContext.getBean("cat");

        System.out.println("helloworld bean: " + (firstHelloWorld == secondHelloWorld));
        System.out.println("cat bean: " + (firstCatBean == secondCatBean));
    }
}