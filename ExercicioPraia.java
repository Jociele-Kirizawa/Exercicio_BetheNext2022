public class ExercicioPraia {
    public static void main(String[] args) {


    String[] praia ={"Enseada", "Pitangueiras", "Asturias", "Pernambuco", "maresia"};
    double[] distancia = {16.7, 14.1, 22.2, 11.1, 7.3};
    double media = 0;
    int j=0;
    int k =0;



        System.out.println("A lista de praia e sua distancia do hotel: ");
    for (int i=0; i < distancia.length; i ++){

        System.out.print( praia[i]+ "  "+ distancia [i] + ", ");
        media = media +distancia[i]/distancia.length;
        if(distancia[j] < distancia[i]){
            j = i;
        }
        if(distancia[i] > 10 && distancia[i] < 15){
            k ++;
        }
    }

        System.out.println("\nA média das distancias é: " + media);
        System.out.println("A praia mais distante é: " + praia[j] );
        System.out.println(k + " estão entre 10 e 15 km ");
    }
}


/*
4. Um hotel quer fazer um levantamento das praias da cidade para uma
programação turística. Sabendo-se que cada praia tem um nome e uma
distância (em Km) do hotel, escreva um programa que forneça os
seguintes dados:

- O nome da praia mais distante.
- Quantas praias estão a mais de 10km e a menos de 15km.
- A distância média das praias.

// Para cada praia deverá ser informado seu nome e a distância em Km
do hotel.

Você deve receber 5 praias;
Você deve armazenar o nome das 5 praias em um array;
*/