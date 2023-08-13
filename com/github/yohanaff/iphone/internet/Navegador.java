package com.github.yohanaff.iphone.internet;

public abstract class Navegador {
    private String url;

    protected Navegador(String url) {
        this.url = url;
    }

    public abstract void exibirPagina();

    public abstract void adicionarNovaAba();

    public abstract void atualizarPagina();

    protected void validarConexaoInternet() {
        System.out.println("Validando se está conectado à internet...");
    }
}
