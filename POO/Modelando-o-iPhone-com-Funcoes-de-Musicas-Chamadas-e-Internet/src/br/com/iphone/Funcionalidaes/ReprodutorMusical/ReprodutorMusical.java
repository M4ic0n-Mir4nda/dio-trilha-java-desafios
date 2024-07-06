package br.com.iphone.Funcionalidaes.ReprodutorMusical;

public class ReprodutorMusical implements Reprodutor{
    private String musica;

    @Override // Polimorfismo > altera o que ´metodo vai fazer
    public void tocar() {
        System.out.println("Tocando: " + this.musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música " + musica + " selecionada.");
    }

}
