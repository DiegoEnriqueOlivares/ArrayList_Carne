/*
 * Unir dos ArrayLists:
 * Entrada:
Primer conjunto de Pokémon: ["Pikachu", "Charizard", "Bulbasaur"]
Segundo conjunto de Pokémon: ["Squirtle", "Jigglypuff"]
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio015 {
    public static void main(String[] args) {
        ArrayList<String> conjunto1 = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur"));
        ArrayList<String> conjunto2 = new ArrayList<>(List.of("Squirtle", "Jigglypuff"));

        conjunto1.addAll(conjunto2);

        System.out.println("\n"+conjunto1+"\n");
    }
}
