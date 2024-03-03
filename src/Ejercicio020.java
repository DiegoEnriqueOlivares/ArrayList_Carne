/*
 * Aumentar el tamaño de un ArrayList:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur"]
Nuevo tamaño deseado: 5
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio020 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur"));
        Scanner sca = new Scanner(System.in);
        int tamaño;

        System.out.print("Ingrese el tamaño deseado: ");
        tamaño = sca.nextInt();

        for (int i = pokemones.size(); i < tamaño; i++) {
            pokemones.add(null);
        }

        System.out.println("\n"+pokemones+"\n");
    }
}
