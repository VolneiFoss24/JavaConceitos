public class FuncoesString {
    public static void main(String[] args) {
        String str = "Estou aprendendo a desenvolver em Java";

        // funcao do objeto que permite acessar o comprimento da string
        System.out.println(str.length());

        // funcao do objeto que permite acessar o caracter atraves da posicao começando em 0 ate ...
        System.out.println(str.charAt(2));

        //funcao de retorno booleano nos mostra se a string informada é igual a existente
        System.out.println(str.equals("usahushuhas"));

        //funcao de retorno booleano nos mostra se a string começa com os caracteres informados
        System.out.println(str.startsWith("prog"));

        //funcao de retorno booleano nos mostra se a string termina com os caracteres informados
        System.out.println(str.endsWith("Java"));

        //função que recorta uma parte da string com base nas posições indicadas
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,10));

        //função que nos permite fazer a substituição de caracteres
        System.out.println(str.replace("Estou", "Aprendi"));

        //funcao que retorna string original em letra maiuscula
        System.out.println(str.toUpperCase());

        //funcao que retorna string original em letra minuscula
        System.out.println(str.toLowerCase());

        //funcao string que remove os espaços em branco do começo e fim
        System.out.println(str.trim());
    }
}
