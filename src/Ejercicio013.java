/*
 * Comparar dos ArrayLists:
 * Primer conjunto de Pokémon: ["Pikachu", "Charizard", "Bulbasaur"]
Segundo conjunto de Pokémon: ["Bulbasaur", "Squirtle", "Jigglypuff"]
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio013 {
    public static void main(String[] args) {
        ArrayList<String> conjunto1 = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur"));
        ArrayList<String> conjunto2 = new ArrayList<>(List.of("Bulbasaur", "Squirtle", "Jigglypuff"));
        boolean iguales=false;

        for (int i=0; i<conjunto1.size(); i++) {
            if (conjunto1.get(i).equalsIgnoreCase(conjunto2.get(i))) {
                iguales=true;
            }
        }

        if (iguales) {
            System.out.println("\nLos conjuntos de Pokemons son iguales.\n");
        } else{
            System.out.println("\nLos conjuntos de Pokemons no son iguales.\n");
        }
    }
    
}
