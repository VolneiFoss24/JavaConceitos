import java.util.Scanner;

public class ExercicioFluxoUm {
    Float jobBonus(String office, Integer time) {

        float bonus = 0f;

        if (office != null && !office.equals("") && time != null) {
            switch (office) {
                case "Gerente":
                    if (time <= 2) {
                        bonus = 2000f;
                    } else {
                        bonus = 3000f;
                    } break;
                case "Coordenador":
                    if (time <= 1) {
                        bonus = 1500f;
                    } else {
                        bonus = 1800f;
                    }
                    break;
                case "Engenheiro de Software":
                    bonus = 1000f;
                    break;
                case "Estagiario":
                    bonus = 500f;
                    break;
                default:
                    System.out.println("Cargo não localizado");
                    break;
            }
        } else {
            System.out.println("Cargo invalido, tente novamente");
        }
        return bonus;
    }

    String squarePerimeter(Integer base, Integer height){
        boolean square = base.equals(height);

        if (square){
            return "com base em sua entrada conseguimos formar um quadrado";
        } else {
            return "não foi possivel formar um quadrado com base na sua entrada";
        }

    }

    String trianglePerimeter(
            Integer base,
            Integer leftSide,
            Integer rightSide){
        boolean triangle = base.equals(leftSide) && base.equals(rightSide);


        if (triangle){
            return "com base em sua entrada conseguimos formar um triangulo";
        } else {
            return "não foi possivel formar um triangulo com base na sua entrada";
        }

    }


    public static void main(String[] args) {
        ExercicioFluxoUm instance = new ExercicioFluxoUm();
        Scanner in = new Scanner(System.in);
        /*
        System.out.println("Digite seu cargo: ");
        String office = in.nextLine();
        int time = in.nextInt();
        float result = instance.jobBonus(office, time);
        System.out.println("Sua bonificacao é de : R$" + result);
         */
        /*
        System.out.print("Digite o valor da base ");
        Integer base = in.nextInt();
        System.out.print("Digite o valor da altura ");
        Integer height = in.nextInt();
        String square = instance.squarePerimeter(base, height);
        System.out.println(square);
         */
        /*
        System.out.print("Digite um valor para o lado esquerdo: ");
        Integer leftSide = in.nextInt();
        System.out.print("Digite um valor para o lado direito: ");
        Integer rightSide = in.nextInt();
        System.out.print("Digite um valor para a base: ");
        Integer base = in.nextInt();
        String triangle = instance.trianglePerimeter(base, leftSide, rightSide);
        System.out.println(triangle);
         */

    }
}
