public class CustoCarroNovo {
    static double carroNovo(double n) {
        double d = n*0.28;
        double e = n*0.45;
        return n + d + e;
    }
    public static void main(String[] args) {
        System.out.println("O custo final de um carro de 100 mil é :" + carroNovo(100000));

    }
}

/*O custo ao consumidor de um carro novo é a soma do custo
de fábrica com a porcentagem do distribuidor e dos impostos.
Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%.
 Escreva um programa que leia o custo de fábrica e informe o custo ao consumidor final.
 */
