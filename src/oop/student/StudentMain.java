package oop.student;
// Skapa en klass Student:
//Konstruktorn ska ta in namn och årskurs.
//Skapa en metod promote som ökar årskursen med
// 1. Skapa en metod som skriver ut vilket stadie
// man går på (Lågstadiet, mellanstadiet osv.)
// Skapa ett Student-objekt och låt det gå upp en
// årskurs i main-metoden. Skriv ut årskurs och
// stadie ifrån mainmetoden.
public class StudentMain {
    public static void main(String[] args) {
        Student myStudent = new Student("Tomas", 7);
        System.out.println(myStudent.getName() + myStudent.stadie());
    }
}
