package br.com.iphone.Funcionalidaes.NavegadorInternet;

public class NavegadorInternet implements Navegador{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }
}
