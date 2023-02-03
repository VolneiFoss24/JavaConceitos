public class Array {
    public static void main(String[] args) {
        // array é uma coleção de dados do mesmo tipo


        /* String[] names = {"Volnei", "Pedro"};
        for (int i = 0; i < names.length ; i++ ){
            System.out.println(names[i]);
        }
         */
        /*
        Integer[] notas = {1, 2, 3 , 4};
        int sum = 0;
        for (int i = 0; i < notas.length; i++){
            sum += notas[i] ;
        }
        System.out.println("a media da turma é: " + sum/4);

 */

        // array enhanced

        Integer[] ages = {15, 18, 12, 33};
        for (int a : ages) {

            if (a >=     18){
                System.out.print("Você é maior de idade - ");
            }
            System.out.println(a);
        }
    }
}
