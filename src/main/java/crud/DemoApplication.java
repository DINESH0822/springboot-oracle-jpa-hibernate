// DemoApplication.java

package crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                DemoApplication.class,
                args
        );
    }

    @Bean
    CommandLineRunner runner(
            EmployeeRepository repository) {

        return args -> {

            Employee emp =
                    new Employee("Samuel", 10000);
            


            repository.save(emp);

            repository.findAll()
                    .forEach(System.out::println);
        };
    }
}