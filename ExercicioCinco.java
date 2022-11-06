import java.util.Scanner;

public class ExercicioCinco {
    static double AjusteSalarial (double salario){
        return salario*1.07;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu salário? ");
        double salario = scan.nextDouble();

        System.out.println("Salário sem ajuste: " + salario);
        System.out.println("Salário pós ajuste: " + AjusteSalarial(salario));

    }
}
/*Crie um programa que com base em um salário de um funcionário, reajusta o
salário em 7% e mostra o valor antes do reajuste e após.
 */

