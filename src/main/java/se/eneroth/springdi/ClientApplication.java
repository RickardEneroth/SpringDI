package se.eneroth.springdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rickard on 2015-02-12.
 */
public class ClientApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);

        app.processMessage("Hej Spring Dependency Injection!", "di@spring.com");

        context.close();
    }
}

