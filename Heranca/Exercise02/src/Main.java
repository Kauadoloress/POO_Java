public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();

        guerreiro.nome = "Kael";
        guerreiro.forca = 1000;
        guerreiro.vida = 210;
        guerreiro.atacarEspada();

        Mago mago = new Mago();

        mago.nome = "Lloyd";
        mago.forca = 60;
        mago.vida= 90;
        mago.atributo = "Fogo";
        mago.lancarFeitico();
    }
}
