import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        
        cleanConsoleScreen();

        /*
        // Faça um Programa que mostre a mensagem "Alo mundo" na tela.
        ex1();
        
        // Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]
        ex2();
        */
        // Faça um Programa que peça dois números e imprima a soma.
        ex3();

        System.out.println();
    }

    private static void cleanConsoleScreen() {

        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    private static void ex1() {
   
        System.out.println(1 + "\n");
        System.out.println("Alo mundo\n");
    
    }

    private static void ex2() {
        
        System.out.println(2 + "\n");
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Please type a number");

        // Numerial  input
        int number = myObj.nextInt();

        // Output input by user
        System.out.println("\nThe number informed was: " + number + "\n");

    }

    private static void ex3() {

        System.out.println(3 + "\n");

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please type two numbers");

        int number  = myObj.nextInt();
        number += myObj.nextInt();

        System.out.println("Their sum is: " + number);
    }
}