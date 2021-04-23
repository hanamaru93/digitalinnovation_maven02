package treinando_encapsulamento.oo;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String variante;


    public  Carro(String marca, String modelo, int ano, String variante){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;



    }

    public String getMarca(){


        return marca;

    }

    public String getModelo(){

        return modelo;

    }

    public int getAno(){

        return ano;

    }

    public String getVariante(){

        return variante;

    }


}
