public class Operadores {
    public static void main(String[] args) {
        // operações matematicas básica:
        System.out.println("2 + 2 = " + (2 + 2));
        System.out.println("2 - 2 = " + (2 - 2));
        System.out.println("2 * 2 = " + (2 * 2));
        System.out.println("2 / 2 = " + (2 / 2));

        System.out.println();

        // operação matemática entre tipos aritmeticos
        int numero = 10;
        float multiplicador = 2.4f;
        System.out.println(numero + " * " + multiplicador + " = " + (numero * multiplicador));

        System.out.println();

        //incremento de tipos

        int numberMore = 10;
        numberMore += 2;

        float numberSub = 10f;
        numberSub -= 2;

        double numberDivision = 10D;
        numberDivision /= 2;

        int numberMult = 10;
        numberMult *= 5;

        System.out.println("incremento + : " + numberMore);
        System.out.println("incremento - : " + numberSub);
        System.out.println("incremento / : " + numberDivision);
        System.out.println("incremento * : " + numberMult);

        System.out.println();

        int number = 10;
        System.out.println("Numero: " + number);
        System.out.println("Sucessor = " + ++number);
        System.out.println("Antecessor = " + --number);

    }
}
