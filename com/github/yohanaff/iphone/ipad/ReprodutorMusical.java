package com.github.yohanaff.iphone.ipad;

public abstract class ReprodutorMusical {
    String nomeMusica;
    String artista;

    protected ReprodutorMusical(String nomeMusica, String artista) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
    }

    public abstract void tocarMusica();

    public abstract void pausarMusica();

    public abstract void selecionarMusica();

}
