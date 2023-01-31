public class Funcoes {

    void hello(){
        System.out.println("Olá!, mundo!");
    }

    String greeting(){
        return "Olá";
    }

    Integer sum(Integer number, Integer adder){
        return number + adder;
    }

    public static void main(String[] args) {
        // ponto de entrada onde executa chamada para outras funções
        new Funcoes().hello();

        String greeting = new Funcoes().greeting();
        System.out.println(greeting);

        Integer sum = new Funcoes().sum(5,5);
        System.out.println("A soma dos números fornecidos é: " + sum);
    }
}
