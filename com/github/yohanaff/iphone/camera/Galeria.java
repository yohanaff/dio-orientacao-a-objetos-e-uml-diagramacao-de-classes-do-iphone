package com.github.yohanaff.iphone.camera;

public class Galeria {
    private Foto[] fotos;
    private Video[] videos;

    public Galeria(Foto[] fotos, Video[] videos) {
        this.fotos = fotos;
        this.videos = videos;
    }

    public void exibirFotos() {
        for (Foto foto : fotos) {
            System.out.println(foto);
        }

    }

    public void exibirVideos() {
        for (Video video : videos) {
            System.out.println(video);
        }
    }
}
