import java.util.Scanner;

public class Questao {
    public static void main(String[] args) {
        double soma =0;
        Scanner scan = new Scanner(System.in);

        double numero = 0;
        double numero1 = 0;
        if (args.length > 2) {
            System.out.println("Quantidade de numero invalida!");

        }else {
        if (args.length == 1) {
            numero = Double.parseDouble(args[0]);
            System.out.println("Digite o segundo numero: ");
            double numero2 = scan.nextDouble();
            System.out.println("A soma dos numeros e :" + (numero + numero2));
        }
        if (args.length == 2) {
            numero=Double.parseDouble(args[0]);
            numero1 = Double.parseDouble(args[1]);
                System.out.println(numero+numero1);
            }

        if (args.length==0){
                System.out.println("Digite o primeiro numero: ");
                double number = scan.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double number2 = scan.nextDouble();
                System.out.println(number2+number);
            }

        }

    }
    }




