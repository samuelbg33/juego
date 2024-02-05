package org.example;


import java.util.Random;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de Papel, Piedra y Tijera!");


        System.out.print("Ingrese su elección (Piedra, Papel o Tijera): ");
        String eleccionUsuario = scanner.nextLine();


        String[] opciones = {"Piedra", "Papel", "Tijera"};
        int indiceComputadora = random.nextInt(opciones.length);
        String eleccionComputadora = opciones[indiceComputadora];

        System.out.println("La computadora eligió: " + eleccionComputadora);


        determinarResultado(eleccionUsuario, eleccionComputadora);
    }

    private static void determinarResultado(String eleccionUsuario, String eleccionComputadora) {
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("Empate. Jueguen otra vez!");
        } else if ((eleccionUsuario.equalsIgnoreCase("Piedra") && eleccionComputadora.equalsIgnoreCase("Tijera")) ||
                (eleccionUsuario.equalsIgnoreCase("Tijera") && eleccionComputadora.equalsIgnoreCase("Papel")) ||
                (eleccionUsuario.equalsIgnoreCase("Papel") && eleccionComputadora.equalsIgnoreCase("Piedra"))) {
            System.out.println("¡Ganaste! " + eleccionUsuario + " vence a " + eleccionComputadora);
        } else {
            System.out.println("¡Perdiste! " + eleccionComputadora + " vence a " + eleccionUsuario);
        }

    }
}