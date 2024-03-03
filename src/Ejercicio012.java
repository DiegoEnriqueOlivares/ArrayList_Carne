/*
 * Extraer una porción del ArrayList:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
Índice de inicio: 1
Índice de fin: 4
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio012 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        List<String> porcion = pokemones.subList(1,4);
        
        System.out.println("\n"+porcion+"\n");
    }
    
}
