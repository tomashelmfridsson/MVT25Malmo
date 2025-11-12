package oop.student;

public class Student {
    private String name;
    private int arskurs;
    static String  titel= "Student";

    public Student(String name, int arskurs) {
        this.name = name;
        this.arskurs = arskurs;
    }

    public String getName() {
        return name;
    }

    public void promote(){
        this.arskurs++;
    }

    public Object stadie() {
        if (arskurs < 1) return "Går ej i skolan ännu";
        if (arskurs < 4) return "Går i lågstadiet";
        if (arskurs < 7) return "Går på mellanstadiet";
        if (arskurs <= 9) return "Går i högstadiet";
        return "Går ej i grundskolan";
    }

    int grade;
    // Metod som returnerar vilket stadie eleven går på
    public String getSchoolStage() {
        if (grade >= 1 && grade <= 3) {
            return "Lågstadiet";
        } else if (grade >= 4 && grade <= 6 || grade == 5) {
            return "Mellanstadiet";
        } else if (grade >= 7 && grade <= 9) {
            return "Högstadiet";
        } else if (grade >= 10 && grade <= 12) {
            return "Gymnasiet";
        }
        return "Okänt stadie";
    }

}
