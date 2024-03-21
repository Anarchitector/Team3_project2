import javax.lang.model.element.VariableElement;
import java.util.concurrent.ThreadLocalRandom;

public class LabWork {

    private Integer id;
    //Поле не может быть null, Значение поля должно быть больше 0,
    //Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String labName; //Поле не может быть null, Строка не может быть пустой
    private Integer minimalPoint; //Поле не может быть null, Значение поля должно быть больше 0
    private Difficulty difficulty; //Поле не может быть null
    private Person author; //Поле может быть null

    public LabWork() {
        this.id = 0;
        this.labName = "name";
        this.minimalPoint = 1;
        this.difficulty = Difficulty.VERY_EASY;
        this.author = new Person("name","0");
    }

    public LabWork(int id, String labName, int minimalPoint, Difficulty difficulty, Person author) {
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

    // Getters
    public Integer getID() { return id; }
    public String getLabName() {
        return labName;
    }
    public Integer getMinimalPoint() { return minimalPoint; }
    public Difficulty getDifficulty() { return difficulty; }
    public Person getAuthor() { return author; }

    public int generateID() {
        return ThreadLocalRandom.current().nextInt();
    }

    // Setters
    public void setID(Integer id) { this.id = id; }
    public void setLabName(String name) { this.labName = name; }
    public void setMinimalPoint(Integer minimalPoint) { this.minimalPoint = minimalPoint; }
    public void setDifficulty(Difficulty difficulty) { this.difficulty = difficulty; }
    public void setAuthor(Person author) { this.author = author; }

    //Validators
    public void validate(Integer id) throws Exception{
        if (id == null || id <=0)
            throw new Exception("Введенное значение поля ID не соответствует требованиям");
    }

    public void validate(String name) throws Exception{
        if (name == null || name.isEmpty())
            throw new Exception("Введенное значение поля ID не соответствует требованиям");
    }
    public void validate(Difficulty difficulty) throws Exception{
        if (difficulty == null)
            throw new Exception("Поле не может быть null");
    }

    public void validate(Person author) throws Exception{
        if (author == null)
            throw new Exception("Поле не может быть null");
    }
}
