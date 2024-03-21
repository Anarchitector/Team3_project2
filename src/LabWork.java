import java.util.concurrent.ThreadLocalRandom;

public class LabWork {

    private Integer id;
    //Поле не может быть null, Значение поля должно быть больше 0,
    //Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Integer minimalPoint; //Поле не может быть null, Значение поля должно быть больше 0
    private Difficulty difficulty; //Поле не может быть null
    private Person author; //Поле может быть null

    public LabWork() {
        this.id = 0;
        this.name = "name";
        this.minimalPoint = 1;
        this.difficulty = Difficulty.VERY_EASY;
        this.author = new Person("name","0");
    }

    public enum Difficulty {
        VERY_EASY,
        EASY,
        NORMAL,
        VERY_HARD,
        INSANE;
    }



    // Getters
    public Integer getID() { return id; }
    public String getName() {
        return name;
    }
    public Integer getMinimalPoint() { return minimalPoint; }
    public Difficulty getDifficulty() { return difficulty; }
    public Person getAuthor() { return author; }

    public int generateID() {
        return ThreadLocalRandom.current().nextInt();
    }


    // Setters


    public void setID(Integer id) {
        try {
            if (id == null || id <= 0 ) {

            }
        }
        catch (IllegalArgumentException e){
            System.err.println("Проверьте значение поля ID на соответствие требованиям задания");
        }

    }

    public void setName(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Поле Name не может быть нулевым или пустым");
            }
            this.name = name;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setMinimalPoint(Integer minimalPoint) {
        try {
            if (minimalPoint == null || minimalPoint <= 0) {
                throw new IllegalArgumentException("Поле Minimal Point не может быть пустым, а также меньше либо равным нулю");
            }
            this.minimalPoint = minimalPoint;
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }

    public void setDifficulty(Difficulty difficulty) {
        try {
            if (id == null) {
                throw new IllegalArgumentException("Поле Difficulty не может быть пустым");
            }
            this.difficulty = difficulty;
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }

    public void setAuthor(Person author) {
        try {
            if (minimalPoint == null) {
                throw new IllegalArgumentException("Объект author не может быть пустым");
            }
            this.author = author;
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }





}
