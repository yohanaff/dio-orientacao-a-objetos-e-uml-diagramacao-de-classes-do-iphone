package com.github.yohanaff.iphone.camera;

public class Video {
    String nome;
    String data;
    String local;

    public Video(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void reproduzirVideo() {
        System.out.println("Reproduzindo vídeo...");
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
    }
}
