/*
 * Reducir la capacidad de un ArrayList:
 * Entrada:
Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
Nueva capacidad deseada: 3
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio019 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>(List.of("Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"));
        Scanner sca = new Scanner(System.in);
        int tamaño;

        System.out.print("Ingrese el tamaño deseado: ");
        tamaño = sca.nextInt();

        for (int i = pokemones.size()-1; i >= tamaño; i--) {
            pokemones.remove(i);
        }

        System.out.println("\n"+pokemones+"\n");
    }
}

