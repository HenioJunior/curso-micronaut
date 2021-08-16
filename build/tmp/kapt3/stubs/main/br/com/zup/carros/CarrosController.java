package br.com.zup.carros;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/carros/CarrosController;", "", "()V", "criar", "Lio/micronaut/http/HttpResponse;", "carro", "Lbr/com/zup/carros/Carro;", "nossa-casa-do-codigo"})
@io.micronaut.http.annotation.Controller()
@io.micronaut.validation.Validated()
public class CarrosController {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/carros")
    public io.micronaut.http.HttpResponse<java.lang.Object> criar(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.carros.Carro carro) {
        return null;
    }
    
    public CarrosController() {
        super();
    }
}