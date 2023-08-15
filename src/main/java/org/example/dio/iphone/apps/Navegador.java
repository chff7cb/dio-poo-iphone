package org.example.dio.iphone.apps;

// Representa um aplicativo capaz de navegar em paginas da web
public interface Navegador {
    // Solicita ao aplicativo navegar para a pagina da web identificada pela URL
    void carregarPagina(String url);
}
