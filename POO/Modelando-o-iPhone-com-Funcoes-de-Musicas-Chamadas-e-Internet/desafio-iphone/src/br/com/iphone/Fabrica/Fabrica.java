package br.com.iphone.Fabrica;

import br.com.iphone.Aparelho.Iphone;
import br.com.iphone.Funcionalidaes.AparelhoTelefonico.AparelhoTelefonico;
import br.com.iphone.Funcionalidaes.NavegadorInternet.NavegadorInternet;
import br.com.iphone.Funcionalidaes.ReprodutorMusical.ReprodutorMusical;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        aparelhoTelefonico.ligar("1111111111");
        navegadorInternet.exibirPagina("http://Youtube.com.br");
        reprodutorMusical.selecionarMusica("MTG");
        reprodutorMusical.tocar();

        System.out.println("----------");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("MTG Carolina");

        System.out.println("----------");

        iphone.exibirPagina("http://Google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("----------");

        iphone.ligar("99999999999");
        iphone.atender();
        iphone.iniciarCorreiovoz();
    }
}
