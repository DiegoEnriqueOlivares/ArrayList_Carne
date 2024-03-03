/* 
 * Insertar un elemento en el ArrayList en la primera posición:
 * Nombres de Pokémon: ["Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
Nuevo Pokémon a insertar: "Pikachu"
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio003 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
    
        pokemones.add(0, "Pikachu");

        System.out.println("\n"+pokemones+"\n");
    }
    
}
