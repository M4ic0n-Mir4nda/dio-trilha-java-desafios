package br.com.iphone.Funcionalidaes.AparelhoTelefonico;

public class AparelhoTelefonico implements Telefone {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para... " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreiovoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
