/**
 * Type      Bit
 * Double    64
 * Float     32
 * <p>
 * Long      64
 * Integer   32
 * Short     16
 * Byte      8
 * <p>
 * Boolean   ?
 * String    ?
 * Char      ?
 */
public class Variaveis {
    public static void main(String[] args) {
        // tipo : o tipo que a variavel irá armazenar (String, Int...)
        // nome : nomenclatura a variavel a gosto do programador de acordo com sua necessidade

        // Declaração
        String name;

        // Atribuição
        name = "Volnei";

        // Publicando no console
        System.out.println(name);

        // Tipos:
        // Inteiros :
        System.out.println("Min: " + Byte.MIN_VALUE + " - Max: " + Byte.MAX_VALUE);
        System.out.println("Min: " + Short.MIN_VALUE + " - Max: " + Short.MAX_VALUE);
        System.out.println("Min: " + Integer.MIN_VALUE + " - Max: " + Integer.MAX_VALUE);
        System.out.println("Min: " + Long.MIN_VALUE + " - Max: " + Long.MAX_VALUE);

        // Pontos flutuantes :
        System.out.println("Min: " + Float.MIN_VALUE + " - Max: " + Float.MAX_VALUE);
        System.out.println("Min: " + Double.MIN_VALUE + " - Max: " + Double.MAX_VALUE);

        //Declaração

        Byte aByte = 5;
        Short aShort = 5;
        Integer aInteger = 5;

        /*
         por se tratar de um número pequeno não há necessidade de ser long,
         o L ao final força o programa aceitar
         */
        Long aLong = 5L;
        Double aDouble = 10.0D;
        Float aFloat = 10.0f;

        Boolean aBoolean = true;
        String str = "ahushauhs";
        Character aChar = 'c';

    }
}
