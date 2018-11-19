package  com.general.freight.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author szy
 */
@MapperScan("com.general.freight.dal.dao")
@SpringBootApplication
@ComponentScan("com.general.freight")
@ImportResource(locations = "classpath:dubbo-consume.xml")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}