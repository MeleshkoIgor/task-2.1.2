public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int depositAmount = 5000;
        int bonus = depositAmount / 100;

        int general = initialAccount + depositAmount + bonus;

        System.out.println("баланс счета:" + general + "рублей");


            }
}
