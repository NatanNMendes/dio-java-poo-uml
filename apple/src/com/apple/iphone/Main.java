package com.apple.iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Imagine - John Lennon");

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println(iphone.exibirPagina("https://www.apple.com"));
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}


