public class FuncoesMath {
    public static void main(String[] args) {
        //Math.max é uma função matematica que nos retorna o maior entre dois numeros ou o menor com Math.min
        Byte numberOne = 5;
        Byte numberTwo = 10;
        System.out.println(Math.max(numberOne, numberTwo));
        System.out.println(Math.min(numberOne, numberTwo));

        //Math.sqrt é uma função matematica que nos retorna a raiz quadrada de um numero double
        Double number = 4D;
        System.out.println(Math.sqrt(number));

        //Math.log nos retorna o logaritmo de um numero
        Byte numberLog = 15;
        System.out.println(Math.log10(16));

        //Math.pow é um número elevado por outro numero
        System.out.println(Math.pow(8,2));

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.round(12.24));
        System.out.println(Math.round(Math.random() * 20));
    }
}
