package org.example.dio.iphone;

import org.example.dio.iphone.gadgets.IPhone;
import org.example.dio.iphone.ios.AppleDialer;
import org.example.dio.iphone.ios.AppleMusic;
import org.example.dio.iphone.ios.Safari;

// Encapsula testes do dispositivo iPhone
public class Main {
    // Testa funcionalidades do iPhone
    public static void main(String[] args) {
        // Instancia um novo dispositivo iOS utilizando aplicativos padroes do sistema iOS
        IPhone meuIphone = new IPhone(new AppleMusic(), new AppleDialer(), new Safari());

        // executa carregamento de uma pagina da web
        meuIphone.navegarParaPagina("https://dio.me");

        // executa trilha de faixa musical
        meuIphone.tocarMusica("The Weeknd", "Starboy");

        // executa discagem de um numero telefonico
        meuIphone.fazerLigacao("+5511111111");
    }
}