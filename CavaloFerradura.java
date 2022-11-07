import java.util.Scanner;

public class CavaloFerradura {
    static int ferradura(int n){ return n*4;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos cavalos voce tem?");
        int n = scan.nextInt();
        System.out.println("O numero necessario de ferraduras é: " + ferradura(n));
    }
}






/*Escreva um programa para calcular a quantidade
de ferraduras necessárias para equipar todos os cavalos
comprados para um haras. A informação de cavalos comprados
deve ser informada pelo usuário.
 */
