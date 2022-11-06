import java.util.Scanner;

public class ExercicioCombustível {
    static double consumo (double distancia, double litros){ return distancia/ litros;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a velocidade da viagem: ");
        double velocidade = scan.nextDouble();
        System.out.println("Qual tempo de viagem : ");
        double tempo = scan.nextDouble();
        double distancia = tempo*velocidade;
        double litros = distancia/12;

        System.out.println("O consumo de combustivel foi de: " + consumo(distancia,litros));
    }

}




/*Escreva um programa para calcular a quantidade de litros de combustível
necessária para se fazer uma viagem, sabendo-se que o carro faz 12 Km com um litro.
Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.

utilizar as seguintes fórmulas:
 	distância = tempo x velocidade
litros usados = distância / 12

*/