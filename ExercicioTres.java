import java.math.*;

public class ExercicioTres {


   public static void main(String[] args) {
        double C = 1000;
        double M;
        double i = 0.02;
        double resultado;
        int t = 5;

            M = C*(1+i);
            resultado = Math.pow(M,5);

       System.out.println(resultado);



    }
}


   /* Escreva um programa que realize o cálculo do empréstimo a juros compostos. Onde definimos:
        o valor da variável de quanto a pessoa quer emprestado;
        em quantos meses ela irá pagar
        A taxa de juros será de 2% ao mês
        Fórmula: M = C * (1+i)^t
        M = valor final após a aplicação dos juros
        C = valor que a pessoa vai pegar emprestado
        i é a taxa de juros
        t é o tempo
        Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros */
