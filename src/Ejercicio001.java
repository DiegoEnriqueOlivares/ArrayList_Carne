/*Crear un ArrayList, agregar nombres de Pokémon e imprima la colección:
Entrada: 
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio001 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypoff"));

        System.out.println("\nPokemones: "+pokemones+"\n");
    }
    
}
