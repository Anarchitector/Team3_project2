import java.util.Objects;

public class Person {
    private String name;
    private String passportID;

    public Person(String name, String passportID) {
        setName(name);
        this.passportID = passportID;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени с проверкой на null и пустую строку
    public void setName(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Имя не может быть нулевым или пустым");
            }
            this.name = name;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public void validateName(String name) throws Exception {
        if (name == null || name.isEmpty())
            throw new Exception("Введенное значение поля Имя не соответствует требованиям");
    }

    // Геттер для номера паспорта
    public String getPassportID() {
        return passportID;
    }

    // Сеттер для номера паспорта
    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", passportID='" + passportID + '\'' +
                '}';
    }
}
