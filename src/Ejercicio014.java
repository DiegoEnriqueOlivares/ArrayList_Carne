/*
 * 1. **Intercambiar dos elementos en el ArrayList**:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
Índice1: 0
Índice2: 4
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio014 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        
        Collections.swap(pokemones, 0, 4);

        System.out.println("\n"+pokemones+"\n");
    }
}
