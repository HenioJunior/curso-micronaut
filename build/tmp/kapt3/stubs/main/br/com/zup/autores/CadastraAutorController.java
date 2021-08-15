package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lbr/com/zup/autores/CadastraAutorController;", "", "autorRepository", "Lbr/com/zup/autores/AutorRepository;", "enderecoClient", "Lbr/com/zup/autores/EnderecoClient;", "(Lbr/com/zup/autores/AutorRepository;Lbr/com/zup/autores/EnderecoClient;)V", "getAutorRepository", "()Lbr/com/zup/autores/AutorRepository;", "getEnderecoClient", "()Lbr/com/zup/autores/EnderecoClient;", "cadastra", "Lio/micronaut/http/HttpResponse;", "request", "Lbr/com/zup/autores/NovoAutorRequest;", "nossa-casa-do-codigo"})
@io.micronaut.http.annotation.Controller(value = "/autores")
@io.micronaut.validation.Validated()
public class CadastraAutorController {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.autores.AutorRepository autorRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.autores.EnderecoClient enderecoClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.HttpResponse<java.lang.Object> cadastra(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.autores.NovoAutorRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.autores.AutorRepository getAutorRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.autores.EnderecoClient getEnderecoClient() {
        return null;
    }
    
    public CadastraAutorController(@org.jetbrains.annotations.NotNull()
    br.com.zup.autores.AutorRepository autorRepository, @org.jetbrains.annotations.NotNull()
    br.com.zup.autores.EnderecoClient enderecoClient) {
        super();
    }
}