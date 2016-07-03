package com.example.utlil;

public interface ExceptionConstants {
    String NOME_NAME = "name";
    String NOME_IDADE = "idade";

    default void teste() {
        System.out.println(NOME_NAME);
    }
}
