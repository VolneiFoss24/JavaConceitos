public class ConversaoDados {
    public static void main(String[] args) {
        /**
         * Conversão de String para numero
         */
        String abc = "100";

        Byte b = Byte.valueOf(abc);
        Short s = Short.valueOf(abc);
        Integer i = Integer.valueOf(abc);
        Float f = Float.valueOf(abc);
        Double d = Double.valueOf(abc);

        System.out.println("String - Byte " + b);
        System.out.println("String - Short " + s);
        System.out.println("String - Integer " + i);
        System.out.println("String - Float " + f);
        System.out.println("String - Double " + d);

        System.out.println();

        /**
         * Conversão entre numeros
         * */

        Byte by = 10;
        System.out.println(by.intValue());
        System.out.println(by.shortValue());
        System.out.println(by.longValue());
        System.out.println(by.doubleValue());
        System.out.println(by.floatValue());

    }
}
