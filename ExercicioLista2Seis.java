import java.util.Scanner;

public class ExercicioLista2Seis {


    static double soma(double a, double b) {return (a + b);
    }

    static double subtracao(double a, double b) {return (a - b);
    }

    static double divisao(double a, double b) {return (a / b);
    }

    static double multiplicacao(double a, double b) { return (a * b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual operação você quer:(1 -; 2 +; 3 /; 4 *");
        int operacao = scan.nextInt();
        System.out.println("Digite o primeiro numero");
        double numero1 = scan.nextInt();
        System.out.println("Digite segundo numero:");
       double numero2 = scan.nextDouble();

        switch (operacao){
            case 1:
                System.out.println("A subtracao é " + subtracao(numero2, numero1));
                break;
            case 2:
                System.out.println("A soma é " + soma(numero1, numero2));
                break;
            case 3:
                System.out.println("A divisao é " + divisao(numero1,numero2));
                break;
            case 4:
                System.out.println("A multiplicacao é " + multiplicacao(numero1,numero2));
                break;
            default:
                System.out.println("Opçao Inválida");
        }

    }
}
/*Realizar uma operação matemática, que deve ser
 passada via System.in ( opções: + - / * ) entre dois números que também devem ser solicitados via System.in
 */