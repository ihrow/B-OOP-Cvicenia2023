package org.example;

public class Student {
    //-------------------------------------------------------------------------------------------------
    // 3.1 Úloha: Trieda "Student"
    //-------------------------------------------------------------------------------------------------
    /*
        Vytvorte triedu s názvom Student, ktorá bude obsahovať nasledujúce atribúty:
            • ID dátový typ: int
            • meno dátový typ: String
            • priezvisko dátový typ: String
            • vek dátový typ: int
        Vytvorte pre všetky atribúty Gettery, Settery, a vytvorte všetky konštruktory na inicializáciu Triedy.
    */
    private int id;
    private String name;
    private String surname;
    private int age;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

    public Student(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}
