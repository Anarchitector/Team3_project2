import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CLIview {

    public static void main(String[] args) throws IOException {

        List<LabWork> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        do {

            System.out.print("Ввод: ");
            String lineIn = scanner.nextLine();

            //Здесь должна быть обработка входящей строки.
            //Строка должна разбиваться на команду и аргументы

            switch (lineIn) {
                case "help": {
                    controller.HelpRead(lineIn);
                    break;
                }
                case "info": {
                    break;
                }
                case "show": {
                    break;
                }
                case "add": {
                    break;
                }
                case "update": {
                    break;
                }
                case "remove_by_id": {
                    break;
                }
                case "clear": {
                    break;
                }
                case "exit": {
                    break;
                }
                case "remove_greater": {
                    break;
                }
                case "remove_lower": {
                    break;
                }
                case "count_greater_than_minimal_point": {
                    break;
                }
            }

        } while (true);
    }
}
