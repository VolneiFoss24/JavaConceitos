import java.util.Scanner;

public class ExercicioPortaria {

    String lobby(Integer age, String invitation, String invitationCode) {
        boolean luxuryGuest = age >= 18 && invitation.equals("luxo") && invitationCode.equals("XL");
        boolean premiumGuest = age >= 18 && invitation.equals("premium") && invitationCode.equals("XL");
        boolean comumGuest = age >= 18 && invitation.equals("comum") && invitationCode.equals("XT");

        if (luxuryGuest || premiumGuest || comumGuest) {
            return "Welcome :)";
        }
        return "Verifique seus dados e tente novamente";

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExercicioPortaria instance = new ExercicioPortaria();

        System.out.print("Informe a sua idade ");
        int age = input.nextInt();

        System.out.print("Qual seu tipo de convite ");
        String invitation = input.next();

        System.out.print("Informe o codigo do convite ");
        String invitationCode = input.next();

        String lobby = instance.lobby(age, invitation, invitationCode);
        System.out.println(lobby);
    }
}
