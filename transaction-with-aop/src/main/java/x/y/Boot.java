package x.y;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import x.y.entity.Foo;
import x.y.service.FooService;

public class Boot {

//    private static Logger LOGGER = LoggerFactory.getLogger(Boot.class);

    public static void main(final String[] args) throws Exception {
//        LOGGER.info("info");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:context.xml");
        FooService fooService = (FooService) ctx.getBean("fooService");
        fooService.insertFoo (new Foo());
    }
}
