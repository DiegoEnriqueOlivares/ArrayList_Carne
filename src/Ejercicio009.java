/*
 * Copiar un ArrayList en otro:
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio009 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        ArrayList<String> Copiapokemons = new ArrayList<>(pokemones);

        System.out.println("\n"+Copiapokemons+"\n");
        

    }
    
}
