public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Ferrari";
        carro.modelo = "Puro Sangue";
        carro.ano = 2024;
        carro.numeroDePorta = 4;
        carro.quantPortas();


        Moto moto = new Moto();
        moto.marca = "Kawasaki";
        moto.modelo = "Ninja";
        moto.ano = 2020;
        moto.cilindrada= 399;
        moto.temCilindrada();


    }
}
