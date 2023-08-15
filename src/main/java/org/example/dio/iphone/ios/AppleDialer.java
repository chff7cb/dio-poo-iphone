package org.example.dio.iphone.ios;

import org.example.dio.iphone.apps.App;
import org.example.dio.iphone.apps.Discador;

// Aplicativo padrao de chamadas do sistema operacional iOS
public class AppleDialer extends App implements Discador {
    // Disca um numero de telefone
    @Override
    public void discarNumero(String numero) {
        System.out.println("o AppleDialer disca o numero " + numero);
    }

    // Identifica o nome dessa classe de aplicativo
    @Override
    public String getNome() {
        return "AppleDialer";
    }
}
