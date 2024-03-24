package models;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Labwork implements Comparable <Labwork> {
    private Integer id;
    //Поле не может быть null, Значение поля должно быть больше 0,
    //Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String labName; //Поле не может быть null, Строка не может быть пустой
    private Integer minimalPoint; //Поле не может быть null, Значение поля должно быть больше 0
    private Difficulty difficulty; //Поле не может быть null
    private Person author; //Поле может быть null
    private static int counter = 0;

    public Labwork() {
        this.id = 0;
        this.labName = "name";
        this.minimalPoint = 1;
        this.difficulty = Difficulty.VERY_EASY;
        this.author = new Person("name","0");
        Labwork.counter++;
        this.id = 918291822 + Labwork.counter; //автоматическая генерация id
    }

    public Labwork(int id, String labName, int minimalPoint, Difficulty difficulty, Person author) {
        this.id = id;
        this.labName = labName;
        this.minimalPoint = minimalPoint;
        this.difficulty = difficulty;
        this.author = author;
    }

    public enum Difficulty {
        VERY_EASY,
        EASY,
        NORMAL,
        VERY_HARD,
        INSANE;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setLabName(String labName) {

        if (labName.equals(null)) {
            System.out.println("Поле не может быть NULL");
        } else if (labName.equals("")) {
            System.out.println("Строка не может быть пустой");
        } else {
            this.labName = labName;
        }
    }

    // Getters
    public Integer getID() { return id; }
    public String getLabName() { return labName; }
    public Integer getMinimalPoint() { return minimalPoint; }
    public Difficulty getDifficulty() { return difficulty; }
    public Person getAuthor() { return author; }

    public int generateID() {
        return ThreadLocalRandom.current().nextInt();
    }

    // Setters
    public void setID(Integer id) { this.id = id; }
//    public void setLabName(String name) { this.labName = name; }
    public void setMinimalPoint(Integer minimalPoint) { this.minimalPoint = minimalPoint; }
    public void setDifficulty(Difficulty difficulty) { this.difficulty = difficulty; }
    public void setAuthor(Person author) { this.author = author; }


    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return  "Labwork " +
                "id=" + id +
                ", labName='" + labName + '\'' +
                ", author=" + author +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Labwork movie = (Labwork) o;
        return getId() == movie.getId() && Objects.equals(getLabName(), Labwork.getLabName())
                && Objects.equals(getAuthor(), Labwork.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLabName(), getAuthor());
    }


    @Override
    public int compareTo(Labwork o) {// переопределяем метод, приводим результат к int
        return (int)(this.getId() - o.getId());
    }

    public String getCSVLine() {
        return id + ";" +
                labName + ";" +
                author.getName();
    }

    public Labwork(int id, String labName, String author, String passportID) throws Exception {
        if (!validateId(id)) {
            throw new Exception("ID is not correct");
        }

        this.labName = labName;
        this.author = new Person(author, passportID);
        Labwork.counter++;
        this.id = id;
    }

    public static Labwork parseFromCSV(String line) {
        // "918291832;Приключения Электроника;ADVENTURE;Евгений Велтистов;true"
        String[] parts = line.split(";");

        if (!Utils.isInt(parts[0])) {
            return null;
        }
        Long id = Long.parseLong(parts[0]);

        if (!Utils.isEnum(parts[2], MovieGenre.class)) {
            return null;
        }
        MovieGenre genre = MovieGenre.valueOf(parts[2]);

        if (!Utils.isBoolean(parts[4])) {
            return null;
        }
        boolean gender = Boolean.parseBoolean(parts[4]);

        try {
            Movie movie = new Movie(
                    id,
                    parts[1],
                    genre,
                    parts[3],
                    gender
            );
            return movie;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean validateId(int value) {
        return value > 0;
    }
}

