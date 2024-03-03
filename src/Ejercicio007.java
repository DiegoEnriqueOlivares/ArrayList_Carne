/*
 * Buscar un elemento en el ArrayList indicar si se encuentra y en qué posición:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"
Elemento a buscar: “Squirtle”.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio007 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        String pokemon;
        boolean encontrado=false;
        int indice=0;

        System.out.print("Ingrese el pokemon que quiere encontrar: ");
        pokemon=sca.nextLine();

        for (int i=0; i<pokemones.size(); i++) {
            if(pokemones.get(i).equalsIgnoreCase(pokemon)){
                encontrado=true;
                indice=i;
            }
        }

        if (encontrado) {
            System.out.println("\nEl pokemon "+pokemon+" si se encontro en la posicion: "+indice+" del arreglo.\n");
        } else {
            System.out.println("\nEl pokemon no se encontro\n");
        }
        
    }
    
}
