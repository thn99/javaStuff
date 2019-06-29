package Aula02;
//tá errado, depois eu vejo de novo
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        int num;
        int cont = 5;
        boolean bool = false;
        int[] vetor = new int[10];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            vetor[i] = scan.nextInt();
        }
        System.out.println(vetor.length);

        while(!bool){
            num = scan.nextInt();
            for(int i = 0; i < 10; i++){
                if(vetor[i] == num){
                    vetor[i] = vetor[i+1];
                    //vetor[i+1] = vetor[i+2];
                    cont--;
                    System.out.println("Contador: " + cont);
                    break;
                }
                else{
                    vetor[cont] = num;
                    cont++;
                    System.out.println("Contador: " + cont);
                    break;
                }
            }
            for(int j = 0; j < vetor.length; j++) System.out.print(vetor[j]);

        }


    }
}
