/*
 * Comprobar si un ArrayList está vacío o no:
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio018 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        
        if (pokemones.isEmpty()) {
            System.out.println("\nEl Array esta vacio\n");
        } else{
            System.out.println("\nEL Array no esta vacio\n");
        }
    }
}
