package com.github.yohanaff.iphone.telefone;

public class Telefone {

    public Telefone(String numero) {
        this.numero = numero;
    }

    private String numero;
    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}
