public class EcercicioLista2 {
    public static void main(String[] args) {


        String nome[] = {"Lucas", "Marina", "Jociele"};
        double notas1[] = {7, 8, 9};
        double notas2[] = {5, 6, 7};
        double notas3[] = {4, 5, 6};
        double media [];
        media = new double[3];

        for (int i = 0; i < nome.length; i++) {
            media [i] = (notas1[i] + notas2[i] + notas3[i]) / 3;
            System.out.println(nome[i] + " " + media[i]);
        }
        }
    }
   /* Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
        Nome
        Turma
        Nota 1
        Nota 2
        Nota 3*/


