public class Main {
    public static void main(String[] args) {
        int costPass = 7862; //стоимость билета
        int stepForMiles = 20; // шаг стоимости за который дают мили

        System.out.println("Dы получаете " + (costPass / stepForMiles) + " бесплатных миль(и)");
    }
}
