package Listadicionario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
    private Map<Integer, List<Peca>> dicionario = new HashMap<>();
    private Integer identificador = 1;

    public Integer guardaPecas(List<Peca> listaDePeca) {
        this.dicionario.put(this.identificador, listaDePeca);
        return this.identificador++;
    }

    public void mostrarPecas(){
        for (Integer id : this.dicionario.keySet()) {
            List<Peca> pecas = this.dicionario.get(id);
            System.out.println("ID: " + id + " - Peças: " + pecas);
        }
    }

    public void mostrarPecas(Integer identificador){
        List<Peca> pecas = dicionario.get(identificador);
        for (Peca peca : pecas) {
            System.out.println("Modelo: "+ peca.modelo + "  |  Marca: "+ peca.marca);
        }
    }

    public void devolverPecas(Integer identificador){
        dicionario.remove(identificador);
    }
    
}
