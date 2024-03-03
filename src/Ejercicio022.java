/*
 * Imprimir todos los elementos de un ArrayList utilizando sus posiciones:
 * Entrada: 
["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"]
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio022 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyaeados", "Vulpix"));

        for (int i = 0; i < pokemones.size(); i++) {
            System.out.println("Indice "+i+" es el Pokemon: "+pokemones.get(i));
        }
        
    }
}
