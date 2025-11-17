package br.com.alula.screenmatch.service;

public interface IConverDados {

    <T> T obterDados(String json, Class<T> clazz);
}
