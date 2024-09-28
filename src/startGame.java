import Functions.*;

import java.util.Scanner;

public class startGame {
    int money = 1000;
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen bei constructed!" +
                "\n" + "Zwei Spieler treten gegeneinander an, um ihre Städte zu entwickeln." +
                "\n" + "Viel Erfolg und möge die beste Stadt gewinnen!" +
                "\n" +
                "\n" + "Drücke die Eingabetaste, um das Spiel zu starten..."
        );

        String input = scanner.nextLine();

        if (input.isEmpty()) {
            ManageCityUpgrades.manageCityUpgrades();
        } else {
            System.out.println("Ungültige Eingabe. Bitte drücke die Eingabetaste, um das Spiel zu starten...");
        }

        scanner.close();
    }
}
