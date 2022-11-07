import java.util.Scanner;

public class PrestracaoMes {
    static double prestracao(double valor){ return valor/5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual valor do produto?");
        double valor = scan.nextDouble();
        System.out.println("O valor das parcelas é 5x de " + prestracao(valor));
    }
}








/*Uma loja está vendendo seus produtos em 5
 prestações sem juros. Faça um programa que
 insira o valor total de uma compra e o valor das prestações.
 */