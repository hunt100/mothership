package kz.hunt.mscore;

import kz.hunt.character.data.entity.mechanics.SpecialAbility;
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
        SpecialAbility specialAbility = new SpecialAbility();
        specialAbility.setName("asdasdsadas");
        System.out.println(specialAbility.getName());
        SpringApplication.run(MsCoreApplication.class, args);
    }

}
