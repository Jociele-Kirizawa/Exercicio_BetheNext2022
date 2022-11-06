import java.util.Scanner;

public class ExercicioListaDoisDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a opcao: 1- nome. 2- endereco. 3- cep e telefone");
        int dados = scan.nextInt();

        
        switch (dados){
            case 1:
                System.out.println("Jociele Martins Kirizawa");
                break;
            case 2:
                System.out.println("Sorocaba-sp");
                break;
            case 3:
                System.out.println("148497986745868459");
                break;
            default:
                System.out.println("Opçao inválida");
        }

    }
}

/* Elabore um programa que escreve seu nome completo na primeira linha,
        seu endereço na segunda, e o CEP e telefone na terceira.*/
