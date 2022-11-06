import java.util.Scanner;

public class Quadrado {
    static int quadrado(int n){ return n*n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma =0;

        for (int i = 0; i< 4; i++){
            System.out.println("Digite um numero");
            int numero = scan.nextInt();
            soma += quadrado(numero);

        }
        System.out.println("A soma dos quadrados dos nuneros são: " + soma);
    }
}


/*Leia 4 (quatro) números calcule o quadrado para cada um (n²) some todos e exiba o resultado*/
