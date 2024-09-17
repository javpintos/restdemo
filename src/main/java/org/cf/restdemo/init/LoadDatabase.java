package org.cf.restdemo.init;

import org.cf.restdemo.model.Empleado;
import org.cf.restdemo.repository.EmpleadoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmpleadoRepository repository) {
        return args -> {
            Empleado javier = new Empleado("Javier Mascherano","CTO");
            Empleado lionel = new Empleado("Lionel Messi","PM");
            Empleado kun = new Empleado("Kun Aguero","CEO");
            log.info("Carga inicial: {}", repository.save(javier));
            log.info("Carga inicial: {}", repository.save(lionel));
            log.info("Carga inicial: {}", repository.save(kun));
        };
    }
}
