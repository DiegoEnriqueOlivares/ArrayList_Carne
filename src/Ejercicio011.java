/*
 * Invertir los elementos en el ArrayList:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ejercicio011 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        
        Collections.reverse(pokemones);

        System.out.println("\n"+pokemones+"\n");
    }

    
}
