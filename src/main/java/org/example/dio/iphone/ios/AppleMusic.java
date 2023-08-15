package org.example.dio.iphone.ios;

import org.example.dio.iphone.apps.App;
import org.example.dio.iphone.apps.Reprodutor;

// Identifica o aplicativo padrao de musica proprietario da Apple Inc.
public class AppleMusic extends App implements Reprodutor {
    // Reproduz uma trilha musical de um artista
    @Override
    public void tocarMusica(String artista, String trilha) {
        System.out.println("AppleMusic toca a musica " + artista + " - " + trilha);
    }

    // Identifica essa classe de aplicativo pelo nome
    @Override
    public String getNome() {
        return "AppleMusic";
    }
}
