package models;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Person {
    private String name;
    private String passportID;

    public Person(String name, String passportID) {
        this.setName(name);
        this.passportID = passportID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Имя не может быть нулевым или пустым");
            }

            this.name = name;
        } catch (IllegalArgumentException var3) {
            System.err.println(var3.getMessage());
        }

    }

    public void validateName(String name) throws Exception {
        if (name == null || name.isEmpty()) {
            throw new Exception("Введенное значение поля Имя не соответствует требованиям");
        }
    }

    public String getPassportID() {
        return this.passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String toString() {
        return "Person{name='" + this.name + "', passportID='" + this.passportID + "'}";
    }
}

