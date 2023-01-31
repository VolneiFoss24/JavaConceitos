import java.util.Scanner;

public class ExercicioFuncoes {

    String timeConverter(Integer ano) {

        int meses = ano * 12;
        int dias = ano * 365;
        int horas = ano * 8760;
        int minutos = ano * 525600;
        double segundos = ano * 3.154e+7;

        return "Meses: " + meses + "\nDias: " + dias + "\nHoras: " + horas +
                "\nMinutos :" + minutos + "\nSegundos:" + segundos;
    }
    Integer phraseLength(String frase) {
        return frase.length();
    }
    Integer cubed(Integer number) {
        return number * number * number;
    }
    Double milesToKilometers(Integer kilometers){
        Double result = kilometers / 1.609;
        return result;
    }
    String replaceCharacter(String str) {
        return str.toLowerCase().replace("a", "x");
    }
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite tempo em ano(s)");
        int year = scanner.nextInt();

        String conversor = new ExercicioFuncoes().timeConverter(year);
        System.out.println(conversor);
         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase para saber a quantidade de caracteres dela:");
        String phrase = scanner.nextLine();

        Integer phraseLength = new ExercicioFuncoes().phraseLength(phrase);
        System.out.println("Comprimento de sua frase é: " + phraseLength);

        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para elevar ao cubo: ");
        Integer cube = scanner.nextInt();
        Integer cubed = new ExercicioFuncoes().cubed(cube);
        System.out.println(cubed);
         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distancia em quilometros: ");
        Integer conversor = scanner.nextInt();
        Double result = new ExercicioFuncoes().milesToKilometers(conversor);
        System.out.println("A distancia em milhas é: " + Math.round(result));
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String phrase = scanner.nextLine();
        String result = new ExercicioFuncoes().replaceCharacter(phrase);
        System.out.println(result);
    }
}
