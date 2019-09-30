package vn.ladudu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan({"vn.ladudu.model", "vn.ladudu.repository", "vn.ladudu.service", "vn.ladudu.controller"})
public class PenzuWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PenzuWebApplication.class, args);
    }

}
