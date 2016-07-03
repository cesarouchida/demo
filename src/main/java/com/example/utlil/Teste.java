package com.example.utlil;

public class Teste {
    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {
//        ExceptionConstants.class.getField("NOME_NAME").set("name","idade");

//        System.out.println(ExceptionConstants.class.getField("NOME_NAME").set("name","idade"));
        System.out.println(ExceptionConstants.NOME_NAME);
        System.out.println(ExceptionConstants.NOME_IDADE);

        new ExceptionConstants(){}.teste();

    }
}
