public class Sinqia_Java {

    static double tempFahrenheit (double celsius){
        return (celsius*1.8)+32;
    }
    public static void main(String[] args) {
        System.out.println("A temperatura 28 graus celsius em Fahrenheit é: " + tempFahrenheit(28));
        System.out.println("A temperatura 35 graus celsius em Fahrenheit é: " + tempFahrenheit(35));

    }
}
