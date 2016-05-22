package lesson.lesson_07.person; // �������� ������

public class Person {
    // ���� ������. final - �������� - ���������� ������������� ������������
    public static final int MAX_NAME_LENGTH = 100;

    // ���� �������
    private String name; // private - ����������� ���������,
    // ��������, ��� ���� �������� ������ ������ ������
    private String surname;
    private String phone;

    // �����������
    public Person(String name, String surname, String phone) {
        this.name = name; // �������� ����� this, ������������ ������� ������
        this.surname = surname;
        this.phone = phone;
    }

    // ������ �����������
    public Person(String name) {
        this.name = name;
    }

    // �����
    public void print() {
        System.out.printf("%s %s: %s", name, surname, phone);
    }

    // ������ ��� �����
    // public - ����������� ���������, �������� ��� ����� �������� �� ����� ����� ���������
    public String getName() {
        return name;
    }

    // ������ ��� �����
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


