package br.com.alula.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("TotalSeasons") Integer totalEmporadas,
                         @JsonAlias("imdbRating") Double avaliacao,
                         @JsonProperty("imdbVotes") String votos) {

}
