/* 
 * Actualizar un elemento del ArrayList con un elemento dado:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
Pokémon a actualizar: "Charizard"
Nuevo Pokémon: "Dragonite"
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio005 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));

        pokemones.set(1, "Dragonite");

        System.out.println("\n"+pokemones+"\n");
    }
    
}
