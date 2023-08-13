package com.github.yohanaff.iphone.internet.apps;

import com.github.yohanaff.iphone.internet.Navegador;

public class Chrome extends Navegador {
    public Chrome(String url) {
        super(url);
    }

    @Override
    public void exibirPagina() {
        validarConexaoInternet();
        System.out.println("Exibindo página no Chrome...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Chrome.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Chrome.");
    }
}
