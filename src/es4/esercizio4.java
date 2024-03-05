package es4;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        System.out.println("Conto alla rovescia: ");

// stampa del conto alla rovescia fino a 0 tramite ciclo for

      for( int i = numero; i >= 0; i--) {
          System.out.println(i);
        }
    }
}
