package Aula01;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        int ano;
        Scanner scan = new Scanner(System.in);

        ano = scan.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0) System.out.println(ano + " é bissexto");

        else if (ano % 400 == 0) System.out.println(ano + " é bissexto");

        else System.out.println(ano + " não é bissexto");

    }
}
