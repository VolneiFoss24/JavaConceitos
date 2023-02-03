public class ExerciciosWhile {

    void blowBalloons() {
        int count = 7;
        int sum = 0;

        while (count < 2000) {
            sum++;
            count += 7;
        }

        System.out.println("O numero de balões para encher é: " + sum);
    }

    void fizBuzz() {
        int count = 1;

        while (count <= 50) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizBuzz");

            } else {
                System.out.print(count);
            }
        }
        count++;

    }

    public static void main(String[] args) {
        new ExerciciosWhile().fizBuzz();
    }
}
