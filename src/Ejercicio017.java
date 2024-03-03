/*
 * Vaciar un ArrayList:
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio017 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        
        pokemones.clear();

        System.out.println("\n"+pokemones+"\n");
    }
}
