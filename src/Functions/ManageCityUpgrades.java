package Functions;

import java.util.Scanner;

public class ManageCityUpgrades {
    public static void manageCityUpgrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Bau von Wohngebieten: Erhöht die Bevölkerung (Kosten: 500€)" +
                "\n" + "2. Bau von Gewerbegebieten: Erhöht die Einnahmen (Kosten: 700€)" +
                "\n" + "3. Bau von Freizeiteinrichtungen: Erhöht die Zufriedenheit (Kosten: 300€)" +
                "\n" + "4. Erweiterung der Infrastruktur: Verbessert OPEN" +
                "\n" +
                "\n" + "Wähle eine Aktion (1 bis 4): "
        );
        String action = scanner.nextLine();
    }
}
