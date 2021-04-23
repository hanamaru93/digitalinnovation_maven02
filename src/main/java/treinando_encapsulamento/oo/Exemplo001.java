package treinando_encapsulamento.oo;

public class Exemplo001 {


    public static void main(String args[]){


        Carro CarroA = new Carro("Fiat", "Toro", 2021, "Turbo");

        System.out.println("A marca do carro é: " + CarroA.getMarca());
        System.out.println("O modelo do carro é: " + CarroA.getModelo());
        System.out.println("O ano do carro é: " + CarroA.getAno());
        System.out.print("A variante do carro é: " + CarroA.getVariante());


    }


}
