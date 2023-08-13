package com.github.yohanaff.iphone.camera;

public class Foto {
    String nome;
    String data;
    String local;

    public Foto(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void exibirFoto() {
        System.out.println("Exibindo foto...");
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
    }
}
