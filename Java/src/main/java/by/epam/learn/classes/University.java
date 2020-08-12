package by.epam.learn.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class University {
    public static void main(String[] args) {
        SimpleDateFormat birthDateFormat = new SimpleDateFormat ("dd.MM.yyyy");
        try
        {
            List<Student> students = new ArrayList<Student>(){
                {
                    add(new Student(1, "Surname1", "Name1", "secondName1", birthDateFormat.parse("05.04.1994"), "Street1, 46", "8(029)2578645", "FTR", 3, "F32"));
                    add(new Student(2, "Surname2", "Name2", "secondName2", birthDateFormat.parse("13.02.1996"), "Street2, 32", "8(029)3562789", "MRB", 1, "M12"));
                    add(new Student(3, "Surname3", "Name3", "secondName3", birthDateFormat.parse("02.01.1995"), "Street3, 12", "8(029)1254897", "JTY", 2, "J22"));
                    add(new Student(4, "Surname4", "Name4", "secondName4", birthDateFormat.parse("18.11.1996"), "Street4, 14", "8(029)4567894", "MRB", 1, "M12"));
                    add(new Student(5, "Surname5", "Name5", "secondName5", birthDateFormat.parse("10.05.1994"), "Street6, 56", "8(029)2456789", "FTR", 3, "F32"));
                    add(new Student(6, "Surname6", "Name6", "secondName6", birthDateFormat.parse("30.04.1996"), "Street5, 24", "8(029)3245678", "MRB", 1, "M12"));
                    add(new Student(7, "Surname7", "Name7", "secondName7", birthDateFormat.parse("20.04.1993"), "Street7, 34", "8(029)0245758", "JTY", 4, "J42"));
                    add(new Student(8, "Surname8", "Name8", "secondName8", birthDateFormat.parse("05.07.1993"), "Street8, 47", "8(029)1045786", "JTY", 4, "J42"));
                    add(new Student(9, "Surname9", "Name9", "secondName9", birthDateFormat.parse("16.09.1994"), "Street9, 8", "8(029)3457821", "RTB", 3, "R32"));
                    add(new Student(10, "Surname10", "Name10", "secondName10", birthDateFormat.parse("04.01.1993"), "Street10, 3", "8(029)4789524", "FTR", 4, "F32"));
                }
            };

            System.out.println("----- Students from current faculty -----");
            String searchFaculty = "FTR";
            getStudentsFromFaculty(students, searchFaculty)
                    .forEach(student -> System.out.println(student.toString()));

            System.out.println("----- Students from current group -----");
            String searchGroup = "F32";
            getStudentsFromGroup(students, searchGroup)
                    .forEach(student -> System.out.println(student.toString()));

            System.out.println("----- Students born after current year -----");
            int searchYear = 1995;
            Date currentYearDate = new SimpleDateFormat ("dd.MM.yyyy").parse("01.01." + searchYear);
            getStudentsBornAfterCurrentYear(students, currentYearDate)
                    .forEach(student -> System.out.println(student.toString()));

            System.out.println("----- Students from faculties and groups -----");
            Set<String> faculties = new HashSet<>();
            students.forEach(student -> faculties.add(student.faculty));
            for (String faculty:faculties) {
                System.out.println("-- " + faculty + " --");
                printList(getStudentsFromFaculty(students, faculty));
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printList(List list) {
        list.forEach(listElement -> System.out.println(listElement.toString()));
    }

    public static List<Student> getStudentsFromFaculty(List<Student> students, String faculty) {
        List<Student> currentFacultyStudents = new ArrayList<>();
        Stream<Student> studentStream = students.stream();
        studentStream
                .filter(student -> student.getFaculty().equals(faculty))
                .forEach(student -> currentFacultyStudents.add(student));
        return currentFacultyStudents;
    }

    public static List<Student> getStudentsFromGroup(List<Student> students, String group) {
        List<Student> currentGroupStudents = new ArrayList<>();
        Stream<Student> studentStream = students.stream();
        studentStream
                .filter(student -> student.getGroup().equals(group))
                .forEach(student -> currentGroupStudents.add(student));
        return currentGroupStudents;
    }

    public static List<Student> getStudentsBornAfterCurrentYear(List<Student> students, Date year) {
        List<Student> currentStudents = new ArrayList<>();
        Stream<Student> studentStream = students.stream();
        studentStream
                .filter(student -> student.getBirthDate().getTime() >= year.getTime())
                .forEach(student -> currentStudents.add(student));
        return currentStudents;
    }
}
