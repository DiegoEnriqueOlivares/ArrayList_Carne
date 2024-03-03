/*
 * Eliminar el tercer elemento del ArrayList:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio006 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        
        pokemones.remove(3-1);
        System.out.println("\n"+pokemones+"\n");
    }
    
}
