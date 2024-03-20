import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;


public class CollectionControl {

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

    public static void HelpRead(String args) throws IOException {
        File f = new File("/home/igor/Projects/Team3_project/src/help.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
}