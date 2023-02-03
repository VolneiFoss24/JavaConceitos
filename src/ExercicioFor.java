import java.util.Scanner;

public class ExercicioFor {

    void increasingNumbers() {
        for (int count = 1; count <= 50; count++) {
            System.out.print(count + " ");
        }
    }
    void decreasingNumbers (){
        for (int count = 50; count >= 1; count--) {
            System.out.print(count + " ");
        }
    }
    void increasingMultiples() {
        for (int count = 1; count <= 50; count++) {
            if (count %5 == 0) {
                continue;
            } else {
                System.out.print(count + " ");
            }
        }
    }
    void sumIncreasingNumbers() {
        int sum = 0;
        for (int count = 1; count <= 50; count++) {
            sum += count;
        }
        System.out.print(sum + " ");
    }

    void exercicioE(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int valor = sc.nextInt();
        for (int i = 0;i < valor; i++){
            System.out.println("#".repeat(i + 1));
        }
    }
    public static void main(String[] args) {
        new ExercicioFor().exercicioE();
    }
}
