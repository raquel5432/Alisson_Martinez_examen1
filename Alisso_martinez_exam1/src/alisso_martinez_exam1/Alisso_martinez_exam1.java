/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alisso_martinez_exam1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Roy Martinez
 */
public class Alisso_martinez_exam1 {

    public static void main(String[] args) {
     Scanner Examen = new Scanner(System.in);
      Random rand = new Random();
     int opciones= 0;
     
        System.out.println("------menu------\n"+
                "1. piramide\n"+
                "2. clave\n"+
                "3. piedra, papel o tijera\n"+
                "4. adivinar\n"+
                "5. salir");
     opciones = Examen.nextInt();
     
     switch (opciones){
         
         case 1 :
            System.out.print("Introduce la altura de la pirámide: ");
                int altura = Examen.nextInt();
                int numero = 1;
                
                
                for (int i = 1; i <= altura; i++) {
                    int suma = 0;

                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print(numero + " ");
                        suma += numero;
                        numero += 2;
                    }

                    System.out.println("=> " + i + ": " + suma);
            }
            System.out.println(" ");
        
             break;
         case 2:
                  System.out.print("Ingresa el mensaje a cifrar o descifrar: ");
        String mensaje = Examen.nextLine();
        String resultado =Examen.nextLine();

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('z' - (c - 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('Z' - (c - 'A'));
            }
            resultado = mensaje + c;
        }

        System.out.println("Resultado: " + resultado);
        
             break;
         case 3:
             int eleccionUsuario = 0;
                    System.out.println("Elige: 1-Piedra, 2-Papel, 3-Tijera");
                    do {
                        System.out.print("Tu elección: ");
                        while (!Examen.hasNextInt()) {
                            System.out.println("Por favor ingresa un número válido.");
                            Examen.next();
                        }
                        eleccionUsuario = Examen.nextInt();
                    } while (eleccionUsuario < 1 || eleccionUsuario > 3);

                    int eleccionComputadora = rand.nextInt(3) + 1;

                    String nombreComputadora = "";
                    switch (eleccionComputadora) {
                        case 1: nombreComputadora = "Piedra"; break;
                        case 2: nombreComputadora = "Papel"; break;
                        case 3: nombreComputadora = "Tijera"; break;
                    }
                    System.out.println("La computadora eligió: " + nombreComputadora);

                    if (eleccionUsuario == eleccionComputadora) {
                        System.out.println("¡Empate!");
                    } else {
                        switch (eleccionUsuario) {
                            case 1:
                                if (eleccionComputadora == 2) System.out.println("Gana la computadora.");
                                else System.out.println("¡Ganaste!");
                                break;
                            case 2:
                                if (eleccionComputadora == 3) System.out.println("Gana la computadora.");
                                else System.out.println("¡Ganaste!");
                                break;
                            case 3:
                                if (eleccionComputadora == 1) System.out.println("Gana la computadora.");
                                else System.out.println("¡Ganaste!");
                                break;
                        }
                    }
             
             
             break;
         case 4:
              int numeroAleatorio = rand.nextInt(100) + 1;
                    int intentosMaximos = 10;
                    int intentos = 0;
                    boolean acertado = false;

                    System.out.println("¡Adivina el número del 1 al 100! Tienes 10 intentos.");

                    while (intentos < intentosMaximos) {
                        System.out.print("Intento " + (intentos + 1) + ": ");
                        int intento;
                        try {
                            intento = Integer.parseInt(Examen.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, introduce un número válido.");
                            continue;
                        }

                        intentos++;

                        if (intento == numeroAleatorio) {
                            System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                            acertado = true;
                        } else {
                            switch (intento < numeroAleatorio ? -1 : 1) {
                                case -1:
                                    System.out.println("El número a adivinar es MAYOR.");
                                    break;
                                case 1:
                                    System.out.println("El número a adivinar es MENOR.");
                                    break;
                            }
                        }

                        if (acertado) {
                            break;
                        }
                    }

                    if (!acertado) {
                        System.out.println("Has agotado los 10 intentos. El número era " + numeroAleatorio + ".");
                    }

              
              
             break;
         case 5:System.out.println("hasta luego :0");
             break;
         default:
             System.out.println("opcion invalida");
         
         
         
     }
        
    }
    
}
