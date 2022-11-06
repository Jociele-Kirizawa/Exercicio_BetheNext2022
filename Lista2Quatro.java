import java.util.Scanner;

public class Lista2Quatro {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        System.out.println (numero%2==0? "Par": "impar");

    }
}

/*Enunciado
Criar uma classe com uma função main que vai receber um número via args e
dizer se esse número é par ou impar. O método main deve ter a menor quantidade de linhas possíveis.
 */