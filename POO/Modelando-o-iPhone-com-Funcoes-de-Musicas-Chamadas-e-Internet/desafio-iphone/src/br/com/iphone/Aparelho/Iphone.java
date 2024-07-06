package br.com.iphone.Aparelho;

import br.com.iphone.Funcionalidaes.AparelhoTelefonico.Telefone;
import br.com.iphone.Funcionalidaes.NavegadorInternet.Navegador;
import br.com.iphone.Funcionalidaes.ReprodutorMusical.Reprodutor;

public class Iphone implements Reprodutor, Telefone, Navegador {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando via Iphone!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via Iphone!");
    }

    @Override
    public void iniciarCorreiovoz() {
        System.out.println("Iniciando Correio de voz via Iphone...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina no navegador do Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova pagina no navegador do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando nova pagina no navegador do Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica via iphone!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica via iphone!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada música: " + musica);
    }
}
