package br.com.alula.screenmatch;

import br.com.alula.screenmatch.model.DadosSerie;
import br.com.alula.screenmatch.service.ConsumoApi;
import br.com.alula.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class ScreenmatchApplication  implements CommandLineRunner {


    public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumoApi =  new ConsumoApi();
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=48b3fc4d");
        System.out.println(json);

        //json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
        //System.out.println(json);

        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

        System.out.println(dados);

    }



}
