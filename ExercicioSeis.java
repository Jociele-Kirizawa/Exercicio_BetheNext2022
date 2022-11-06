import java.util.Scanner;

public class ExercicioSeis {
    static double consumo (double distancia, double litros){
        return distancia/litros;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a distancia: ");
        double distancia = scan.nextDouble();
        System.out.println("digite a qte de litros: ");
        double litros = scan.nextDouble();
        System.out.println("O consumo é de: " + consumo(distancia,litros));
    }

}

/*Escreva um programa em java para definir o consumo médio
de um automóvel sendo fornecido a distância total percorrida
pelo automóvel e o total de combustível gasto (litros).
 */
