public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        System.out.println("Soma=" + soma.executar(10,5));
        System.out.println("-------------------");
        Subtracao subtracao = new Subtracao();
        System.out.println("Subtração=" + subtracao.executar(20, 15));
        System.out.println("--------------------");
        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println("Multiplicação= " + multiplicacao.executar(10,10));
    }
}
