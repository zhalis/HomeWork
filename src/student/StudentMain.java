package student;

import student.comparator.AgeComparator;
import student.comparator.MarkComparator;
import student.comparator.NameComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StudentMain {

    public static void main(String[] args) {
        double averageAgeStudents = 0.0;
        ThreadLocalRandom random = ThreadLocalRandom.current();
        String[] names = {"Геннадий", "Павел", "Валерий", "Татьяна", "Виталий", "Евгений", "Снежана", "Роман",
                "Кристина", "Иван", "Алина", "Эдита", "Станислав", "Лилия", "Людмила", "Руслан", "Яна", "Мария", "Анна", "Олег"};

        List<Student> students = new ArrayList<>();
        List<Student> studentsFilteredByAgesAndMarks = new ArrayList<>();

        System.out.println("Задание 2:");
        for (int i = 0; i < 10000; i++) {
            students.add(new Student(i + 1, names[random.nextInt(20)],
                    random.nextInt(7, 18), random.nextInt(101) / 10.0, random.nextBoolean()));
        }
        System.out.println("Задание 3:");
        for (Student student : students) {
            if (student.getAge() > 12 && student.getMark() > 8) {
                studentsFilteredByAgesAndMarks.add(student);
            }
        }

        System.out.println("Задание 4:");
        for (Student student : studentsFilteredByAgesAndMarks) {
            averageAgeStudents += student.getAge();
        }
        averageAgeStudents = averageAgeStudents / studentsFilteredByAgesAndMarks.size();
        System.out.println(averageAgeStudents);

        System.out.println("Задание 5:");
        studentsFilteredByAgesAndMarks.sort(new NameComparator());
        for (int i = 0; i < 10; i++) {
            System.out.println(studentsFilteredByAgesAndMarks.get(i));
            System.out.println();
        }
        System.out.println("Задание 6:");
        studentsFilteredByAgesAndMarks.sort(new MarkComparator());
        for (int i = 0; i < 10; i++) {
            System.out.println(studentsFilteredByAgesAndMarks.get(i));
            System.out.println();
        }
        System.out.println("Задание 7:");
        studentsFilteredByAgesAndMarks.sort(new AgeComparator().thenComparing(new MarkComparator()));
        for (int i = 13; i <= 17; i++) {
            int counter = 0;
            for (Student student : studentsFilteredByAgesAndMarks) {
                 if (student.getAge() == i) {
                    System.out.println(student);
                    counter++;
                }
                if (counter == 10){
                    break;
                }
            }
        }
    }
}
