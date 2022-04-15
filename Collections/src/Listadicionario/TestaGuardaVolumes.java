package Listadicionario;

import java.util.ArrayList;
import java.util.List;

public class TestaGuardaVolumes {
    public static void main(String[] args) {
        GuardaVolumes guardaVolumes = new GuardaVolumes();
        
        List<Peca> usuario1 = new ArrayList<>();
        List<Peca> usuario2 = new ArrayList<>();
        // List<Peca> usuario3 = new ArrayList<>();

        usuario1.add(new Peca("J4 Plus", "Samsung"));
        usuario1.add(new Peca("Chave de casa", "Metal"));
        usuario1.add(new Peca("Chave carro", "Metal"));

        usuario2.add(new Peca("IPhone 10", "Apple"));

        Integer idUsuario1 = guardaVolumes.guardaPecas(usuario1);

        Integer idUsuario2 = guardaVolumes.guardaPecas(usuario2);

        guardaVolumes.mostrarPecas();
        // System.out.println("ID Usurio 1: "+ idUsuario1);
        // System.out.println("ID Usurio 2: "+ idUsuario2);
    }
    
}
