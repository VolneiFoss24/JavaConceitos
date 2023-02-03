import java.util.Scanner;

public class LacoFor {

    void countPairs() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    void countdown() {
        for (int i = 10; i > 0; i--) {

            System.out.println(i);
        }
    }

    void alphabet() {
        char a;

        for (a = 'a'; a <= 'z'; a++) {
            System.out.println(a);
        }
    }

    void multiplesOfThree() {
        int sum = 0;
        for (int count = 1; count <= 500; count++) {
            if (count % 2 != 0 && count % 3 == 0) {
                sum += count;
                System.out.println(count);
            }
        }
        System.out.println("----------------");
        System.out.println("O total somado é: " + sum);
    }

    void groupHeight() {
        Scanner input = new Scanner(System.in);
        int greaterHeight = Integer.MAX_VALUE;
        int shorterHeight = Integer.MIN_VALUE;

        for (int count = 1; count <= 4; count++) {
            System.out.print("Digite sua altura: ");
            int getValue = input.nextInt();

            if (getValue > greaterHeight ){
                greaterHeight = getValue;
            }
            if (getValue < shorterHeight){
               shorterHeight = getValue;
            }
        }

        input.close();

        System.out.println("Maior altura: " + greaterHeight);
        System.out.println("Menor altura: " + shorterHeight);
    }

    public static void main(String[] args) {
        new LacoFor().groupHeight();
    }
}