import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> personalities = new ArrayList<>();
        String line = scanner.nextLine();

        while (!line.equalsIgnoreCase("END")) {
            String[] data = line.split(" ");

            if (data.length == 3) {
                Identifiable citizen = new Citizen(data[0], Integer.parseInt(data[1]), data[2]);
                personalities.add(citizen);
            } else if (data.length == 2) {
                Identifiable robot = new Robot(data[0], data[1]);
                personalities.add(robot);
            }

            line = scanner.nextLine();
        }

        String endNumbers = scanner.nextLine();
        for (Identifiable identifiable : personalities) {
            if (identifiable.getId().endsWith(endNumbers)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}