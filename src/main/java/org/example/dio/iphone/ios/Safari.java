package org.example.dio.iphone.ios;

import org.example.dio.iphone.apps.App;
import org.example.dio.iphone.apps.Navegador;

// Implementa o navegador da web padrao do sistema iOS
public class Safari extends App implements Navegador {
    // Solicita ao aplicativo carregar uma pagina da web
    @Override
    public void carregarPagina(String url) {
        System.out.println("Navegador Safari carrega a pagina da URL: " + url);
    }

    // Identifica essa classe de aplicativo pelo seu nome
    @Override
    public String getNome() {
        return "Safari";
    }
}
