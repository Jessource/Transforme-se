package Listadicionario;

public class Peca {
    String modelo;
    String marca;

    public Peca(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;


    }

    @Override
    public String toString(){
        return "Modelo: "+ this.modelo + "  |  Marca: "+ this.marca;
    }

    // public abstract void retirada();
}
