/*
 * Reemplazar el segundo elemento de un ArrayList:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
Nuevo Pokémon para reemplazar: "Venusaur"
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio021 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        
        pokemones.set(1, "Venusaur");

        System.out.println("\n"+pokemones+"\n");
    }
}
