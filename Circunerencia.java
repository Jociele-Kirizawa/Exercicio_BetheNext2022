import java.util.Scanner;
import java.math.*;

 public class Circunerencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o raio da circunferência que você gostaria de saber a area?");
        double raio = scan.nextDouble();
        System.out.println("A area é: " + Math.PI*Math.pow(raio, 2));
    }


     }



/*Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
Cálculo:  área = PI * (raio²)
*/