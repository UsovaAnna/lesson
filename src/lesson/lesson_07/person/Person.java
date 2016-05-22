package lesson.lesson_07.person; // название пакета

public class Person {
    // поле класса. final - означает - переменная единственного присваивания
    public static final int MAX_NAME_LENGTH = 100;

    // поля объекта
    private String name; // private - модификатор видимости,
    // означает, что поле доступно только внутри класса
    private String surname;
    private String phone;

    // конструктор
    public Person(String name, String surname, String phone) {
        this.name = name; // ключивое слово this, обозначающее текущий объект
        this.surname = surname;
        this.phone = phone;
    }

    // второй конструктор
    public Person(String name) {
        this.name = name;
    }

    // метод
    public void print() {
        System.out.printf("%s %s: %s", name, surname, phone);
    }

    // геттер для имени
    // public - модификатор видимости, означает что метод доступен из любой точки программы
    public String getName() {
        return name;
    }

    // сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


