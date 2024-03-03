/* Recorrer e imprimir todos los elementos en un ArrayList:
    Entrada: 
    ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"]
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J']
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio002 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"));
        ArrayList<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Character> letras = new ArrayList<>(List.of('A','B','C','D','E','F','G','H','I','J'));
        
        System.out.print("\nPokemones: "+pokemones+"\n"+
        "\nNumeros: "+numeros+"\n"+
        "\nLetras: "+letras+"\n");

    }
}
