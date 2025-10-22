package oop.student;

public class Student {
    private String name;
    private int arskurs;

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
}
