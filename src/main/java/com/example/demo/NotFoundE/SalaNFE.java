package com.example.demo.NotFoundE;

public class SalaNFE extends RuntimeException{

    private static final long serialVersionUID = 1L;
    SalaNFE(Long id) {
        super("No se encontró la sala: " + id);
    }
}
