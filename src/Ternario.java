import java.util.Scanner;

public class Ternario {

    Boolean majority(Integer age){
        boolean check = (age >= 18);
        return check;
    }

    String party () {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade");
        int age = input.nextInt();
        boolean validation = majority(age);
        String entrance = validation ? "Seja bem vindo a festa!" : "Lamento, você não tem autorização para entrar";
        return entrance;
    }

    public static void main(String[] args) {
        Ternario instance = new Ternario();
        String party = instance.party();
        System.out.println(party);
    }
}
