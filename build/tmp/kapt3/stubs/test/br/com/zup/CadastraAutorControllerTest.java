package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\nH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/CadastraAutorControllerTest;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "enderecoClient", "Lbr/com/zup/autores/EnderecoClient;", "getEnderecoClient", "()Lbr/com/zup/autores/EnderecoClient;", "setEnderecoClient", "(Lbr/com/zup/autores/EnderecoClient;)V", "deveCadastrarUmNovoAutor", "", "enderecoMock", "nossa-casa-do-codigo"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class CadastraAutorControllerTest {
    @javax.inject.Inject()
    public br.com.zup.autores.EnderecoClient enderecoClient;
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.HttpClient client;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.autores.EnderecoClient getEnderecoClient() {
        return null;
    }
    
    public final void setEnderecoClient(@org.jetbrains.annotations.NotNull()
    br.com.zup.autores.EnderecoClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.junit.jupiter.api.Test()
    public final void deveCadastrarUmNovoAutor() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.test.annotation.MockBean(value = br.com.zup.autores.EnderecoClient.class)
    public final br.com.zup.autores.EnderecoClient enderecoMock() {
        return null;
    }
    
    public CadastraAutorControllerTest() {
        super();
    }
}