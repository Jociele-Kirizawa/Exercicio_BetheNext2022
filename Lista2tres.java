public class Lista2tres {
    public static void main(String[] args) {

        String [] nome = {"Aline", "Mario", "Sergio", "Shirley"};
        String [] nota = {"9.0", "DEZ", "4.5", "7.0"};


        System.out.println("ALUNO" + "         " + "NOTA");
        System.out.println("------------------------");
        for(int i = 0; i< nome.length; i++){
            System.out.println( nome[i]+ "         " + nota [i]);
    }

    }


}
