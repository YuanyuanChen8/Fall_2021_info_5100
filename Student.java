package com.company;
import java.util.*;
import java.util.Comparator;
import java.util.Date;
class Main {
    public static void main(String[] args) {
        Student student1 = new Student(01, "Mike", 3.5, new Date(2001,1,13));
        Student student2 = new Student(02, "Joe", 3.4, new Date(1998,6,17));
        Student student3 = new Student(03, "Andy", 3.1, new Date(1999,9,9));

        List<Student> list = new ArrayList<>(Arrays.asList(student1, student2,
                student3));
        for(Student s : list){
            System.out.println(s.toString());
        }
        Collections.sort(list, new Student.NameComparator());
        System.out.println("----------------------------------");
        System.out.println("sorted by name in ascending order:");
        for(Student s : list){
            System.out.println(s.toString());
        }
        Collections.sort(list, new Student.GpaComparator());
        System.out.println("----------------------------------");
        System.out.println("sorted by gpa in descending order:");
        for(Student s : list){
            System.out.println(s.toString());
        }
        Collections.sort(list, new Student.DateOfBirthComparator());
        System.out.println("----------------------------------");
        System.out.println("sorted by date of birth in ascending order:");
        for(Student s : list){
            System.out.println(s.toString());
        }
    }
}

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;
    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    static class NameComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            return a.getName().compareTo(b.getName());
        }
    }
    static class GpaComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            return Double.compare(b.getGpa(), a.getGpa());
        }
    }
    static class DateOfBirthComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            return a.getDateOfBirth().compareTo(b.getDateOfBirth());
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}