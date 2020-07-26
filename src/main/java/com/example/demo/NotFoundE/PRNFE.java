package com.example.demo.NotFoundE;

public class PRNFE extends RuntimeException{

    private static final long serialVersionUID = 1L;
    PRNFE(Long id) {
        super("No se encontró el miembro del personal: " + id);
    }
}
