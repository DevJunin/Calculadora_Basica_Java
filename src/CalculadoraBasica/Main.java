package CalculadoraBasica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 0;
        Logic calc = new Logic();
        Scanner sc = new Scanner(System.in);
        while (escolha != 9) {
            System.out.println("----------- Caclculadora -----------");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("9 - Sair");
            System.out.println("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------------");
            calc.escolha(escolha);

        }
    }
}
