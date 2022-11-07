import java.util.Scanner;

public class ValorVenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valor = scan.nextDouble();
        System.out.println("Digite o percentual de venda");
        double percentual = scan.nextDouble();
        System.out.println( "O valor da venda será: " + (valor + (valor*percentual/100)));
    }

}




/*Faça um programa que receba o preço de custo do
produto e exiba o valor de venda. O valor de venda receberá
um acréscimo de acordo com o percentual informado pelo usuário.
 */


