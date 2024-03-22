import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class Controller {

    private List<LabWork> labWorkList = new ArrayList<>();


    public void addLabWork(int id, String labName, int minimalPoint, LabWork.Difficulty difficulty, Person author) {
        labWorkList.add(new LabWork(id, labName, minimalPoint, difficulty, author));
    }
//?
    public void removeLabWorkById(int id) {
        labWorkList.remove(id);
    }

    public void clearLabWorkList() {
        labWorkList.clear();
    }



    public void HelpRead(String args) throws IOException {
        File f = new File("/home/igor/Projects/Team3_project/src/help.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
    // Метод для вывода информации о коллекции
    public void info() {
        System.out.println("Тип коллекции: ArrayList<LabWork>");
        System.out.println("Количество элементов: " + labWorkList.size());
    }

    // Метод для вывода всех элементов коллекции
        public void show() {
        for (LabWork labWork : labWorkList) {
            System.out.println(labWork);
        }
    }
}