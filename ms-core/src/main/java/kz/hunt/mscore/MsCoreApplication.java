package kz.hunt.mscore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "kz.hunt")
@EntityScan(basePackages = "kz.hunt.character")
@EnableJpaRepositories(basePackages = "kz.hunt.character.repository")
public class MsCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCoreApplication.class, args);
    }

}
