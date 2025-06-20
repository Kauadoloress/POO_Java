public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        impressora.ligar();
        impressora.desligar();

        System.out.println("------------------");
        Computador computador = new Computador();

        computador.ligar();
        computador.desligar();
    }
}
