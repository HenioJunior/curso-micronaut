package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/autores/BuscaAutoresController;", "", "autorRepository", "Lbr/com/zup/autores/AutorRepository;", "(Lbr/com/zup/autores/AutorRepository;)V", "getAutorRepository", "()Lbr/com/zup/autores/AutorRepository;", "lista", "Lio/micronaut/http/HttpResponse;", "", "Lbr/com/zup/autores/DetalhesDoAutorResponse;", "nossa-casa-do-codigo"})
@io.micronaut.http.annotation.Controller(value = "/autores/busca")
public class BuscaAutoresController {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.autores.AutorRepository autorRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public io.micronaut.http.HttpResponse<java.util.List<br.com.zup.autores.DetalhesDoAutorResponse>> lista() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.autores.AutorRepository getAutorRepository() {
        return null;
    }
    
    public BuscaAutoresController(@org.jetbrains.annotations.NotNull()
    br.com.zup.autores.AutorRepository autorRepository) {
        super();
    }
}