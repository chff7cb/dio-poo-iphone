package org.example.dio.iphone.gadgets;

import org.example.dio.iphone.apps.Navegador;
import org.example.dio.iphone.apps.Reprodutor;
import org.example.dio.iphone.apps.Discador;

// Representa o dispositivo iPhone criado e fabricado pela Apple Inc.
public class IPhone {
    // Aplicativo padrao para reproducao de musica
    private Reprodutor reprodutor;

    // Aplicativo padrao para discagem de voz
    private Discador discador;

    // Aplicativo padrao para navegacao na web
    private Navegador navegador;

    // Cria uma instancia do dispositivo iPhone com seus aplicativos padroes instalados
    public IPhone(Reprodutor reprodutor, Discador discador, Navegador navegador) {
        this.reprodutor = reprodutor;
        this.discador = discador;
        this.navegador = navegador;
    }

    // Faz o dispositivo efetuar uma ligacao
    public void fazerLigacao(String numero) {
        System.out.println("iPhone usa o app " + this.discador + " para executar acao 'fazerLigacao'");
        this.discador.discarNumero(numero);
    }

    // Faz o dispositivo navegador para uma pagina da web
    public void navegarParaPagina(String url) {
        System.out.println("iPhone usa o app " + this.navegador + " para executar acao 'navegarParaPagina'");
        this.navegador.carregarPagina(url);
    }

    // Faz o dispositivo reproduzir uma trilha musical de um artista
    public void tocarMusica(String artista, String musica) {
        System.out.println("iPhone usa o app " + this.reprodutor + " para executar acao 'tocarMusica'");
        this.reprodutor.tocarMusica(artista, musica);
    }
}
