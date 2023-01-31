import java.util.Scanner;

public class ControleFluxoTeoria {

    void majority(Integer age){
        if (age >= 18){
            System.out.println("Idade informada: " + age + "\nVocê já pode tirar habilitação e se alistar");
        } else {
            System.out.println("Aproveite sua adolescencia!");
        }
    }

    void bonusExperience(Integer time){
        if (time == 0) {
            System.out.println("você recebeu um bonus de R$250,00");
        } else if (time == 1) {
            System.out.println("você recebeu um bonus de R$500,00");
        } else {
            System.out.println("você recebeu um bonus de R$1000,00");
        }
    }

    Float experienceBonus(Integer time){

        Float bonus = 1500f;

        if (time == 1) {
            bonus = 0f;
        } else if (time == 2) {
            bonus = 500f;
        } else if (time == 3){
            bonus = 1000f;
        }

        return bonus;
    }

    public static void main(String[] args) {
        /**
         * Controle de Fluxo
         * <p>
         * Controle de fluxo só executa quando seu valor boolean for true
         * estrutura:
         * palavra reservada : if
         * condição (1 < 2 ...)
         * Bloco de execução {logica...}
         * * */

        ControleFluxoTeoria main = new ControleFluxoTeoria();
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Digite sua idade: ");
        Integer age = scanner.nextInt();
        main.majority(age);
         */
        /*
        System.out.print("Digite seu tempo na empresa");
        Integer time = scanner.nextInt();
        main.bonusExperience(time);
         */
        System.out.print("Digite seu tempo de colaboração na empresa: ");
        Integer time = scanner.nextInt();
        Float bonus = main.experienceBonus(time);
        System.out.println("Sua gratificação é R$" + bonus);


    }
}
