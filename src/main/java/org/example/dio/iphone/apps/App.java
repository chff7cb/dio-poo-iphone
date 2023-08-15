package org.example.dio.iphone.apps;

// Representa um aplicativo instalado em um dispositivo multifuncional portatil
public abstract class App {
    // Identifica o nome desse aplicativo
    public abstract String getNome();

    // Fornece o uso do nome do aplicativo como sua representacao textual
    @Override
    public String toString() {
        return getNome();
    }
}
