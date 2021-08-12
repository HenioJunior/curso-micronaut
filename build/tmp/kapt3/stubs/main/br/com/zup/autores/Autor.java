package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lbr/com/zup/autores/Autor;", "", "nome", "", "email", "descricao", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "criadoEm", "Ljava/time/LocalDateTime;", "getCriadoEm", "()Ljava/time/LocalDateTime;", "getDescricao", "()Ljava/lang/String;", "getEmail", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNome", "nossa-casa-do-codigo"})
@javax.persistence.Entity()
public final class Autor {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue()
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime criadoEm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String descricao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCriadoEm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNome() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescricao() {
        return null;
    }
    
    public Autor(@org.jetbrains.annotations.Nullable()
    java.lang.String nome, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String descricao) {
        super();
    }
}