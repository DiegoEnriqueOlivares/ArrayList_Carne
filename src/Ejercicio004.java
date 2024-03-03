/*
 * Recuperar un elemento de un índice especificado:
 * Entrada:
["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"]
Índice especificado: 2 

Salida:
Pokémon en el índice 2: Bulbasaur
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio004 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in); 
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"));
        int opcion;

        System.out.print("Ingrese el indice del pokemon que quiere mostrar: ");
        opcion = sca.nextInt();

        System.out.print("\nPokemon en el indice "+opcion+": "+pokemones.get(opcion)+"\n");
    }
    
}
