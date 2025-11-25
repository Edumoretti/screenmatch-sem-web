package br.com.alula.screenmatch;

import br.com.alula.screenmatch.model.DadosTemporada;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.Principal;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication  implements CommandLineRunner {


    public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Principal principal = new Principal();

        principal.exibeMenu();




    }



}
