import java.util.Objects;

public class Person {
    private String name;
    private String passportID;

    public Person(String name, String passportID) {
        try {
            // Устанавливаем имя, проверяем на корректность
            setName(name);
            // Устанавливаем номер паспорта
            this.passportID = passportID;
        } catch (IllegalArgumentException e) {
            // Если возникла ошибка, выводим сообщение об ошибке
            System.err.println(e.getMessage());
        }
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
