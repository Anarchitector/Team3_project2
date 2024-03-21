import java.util.Scanner;

public class CLIview {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Ввод: ");
            String lineIn = scanner.nextLine();

            //Здесь должна быть обработка входящей строки.
            //Строка должна разбиваться на команду и аргументы

            switch (lineIn) {
                case "help": {
//                    HelpRead(lineIn);
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
