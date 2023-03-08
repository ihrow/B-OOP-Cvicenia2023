package org.example;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        sortStudentArray();
    }
    //-------------------------------------------------------------------------------------------------
    // 3.2 Úloha: Sortovanie
    //-------------------------------------------------------------------------------------------------
    /*
        Vytvorte pole a naplňte ho prvkami triedy z predchádzajúcej úlohy
    */
    public static Student[] initStudentArray() {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Eduard", "Jankovič", 21);
        students[1] = new Student(2, "Peter", "Novak", 19);
        students[2] = new Student(3, "Tomas", "Zajac", 22);
        students[3] = new Student(4, "Richard", "Malý", 20);
        students[4] = new Student(5, "Samuel", "Kráľ", 20);
        return students;
    }

    /*
        Implementujte triedenie daného poľa. (Arrays.sort())
    */
    public static void sortStudentArray() {
        Student[] students = initStudentArray();

        /*
            Umožnite používateľovi zvoliť smer triedenia.
        */
        Scanner sc = new Scanner(System.in);

        // 0 - descending, 1 - ascending
        int smerTriedenia = -1;
        System.out.println("Zvolte smer triedenia: 0 - descending, 1 - ascending.");
        while (smerTriedenia != 1 && smerTriedenia != 0) {
            smerTriedenia = sc.nextInt();
        }

        /*
            Umožnite používateľovi zvoliť parameter, podľa ktorého sa má pole zotriediť.
        */
        System.out.println("Zvolte parameter, podľa ktorého sa má pole zotriediť.");
        String sortParameter = "";
        while (!sortParameter.equals("id") && !sortParameter.equals("name") && !sortParameter.equals("surname") && !sortParameter.equals("age")) {
            sortParameter = sc.nextLine();
        }

        /*
            Naštudujte si dokumentáciu a použite na zotriedenie utility metódu Arrays.sort()
        */
        switch (sortParameter) {
            case "name":
                sortByName(students, smerTriedenia);
                break;
            case "surname":
                sortBySurname(students, smerTriedenia);
                break;
            case "age":
                sortByAge(students, smerTriedenia);
                break;
            case "id":
                sortById(students, smerTriedenia);
                break;
            default:
                System.out.println("Zadali ste nesprávny parameter.");
                break;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static Student[] sortById(Student[] students, int smerTriedenia) {
        switch (smerTriedenia) {
            case 0:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s2.getId() - s1.getId();
                    }
                });
                break;
            case 1:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.getId() - s2.getId();
                    }
                });
                break;
            default:
                System.out.println("Zadali ste nesprávny smer triedenia.");
                break;
        }
        return students;
    }

    private static Student[] sortByName(Student[] students, int smerTriedenia) {
        switch (smerTriedenia) {
            case 0:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s2.getName().compareTo(s1.getName());
                    }
                });
                break;
            case 1:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.getName().compareTo(s2.getName());
                    }
                });
                break;
            default:
                System.out.println("Zadali ste nesprávny smer triedenia.");
                break;
        }
        return students;
    }

    private static Student[] sortBySurname(Student[] students, int smerTriedenia) {
        switch (smerTriedenia) {
            case 0:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s2.getSurname().compareTo(s1.getSurname());
                    }
                });
                break;
            case 1:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.getSurname().compareTo(s2.getSurname());
                    }
                });
                break;
            default:
                System.out.println("Zadali ste nesprávny smer triedenia.");
                break;
        }
        return students;
    }

    private static Student[] sortByAge(Student[] students, int smerTriedenia) {
        switch (smerTriedenia) {
            case 0:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s2.getAge() - s1.getAge();
                    }
                });
                break;
            case 1:
                Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.getAge() - s2.getAge();
                    }
                });
                break;
            default:
                System.out.println("Zadali ste nesprávny smer triedenia.");
                break;
        }
        return students;
    }
}