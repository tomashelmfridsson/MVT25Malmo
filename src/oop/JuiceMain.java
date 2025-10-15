package oop;

public class JuiceMain {
    public static void main(String[] args) {
        Juice minJuice = new Juice("Gul", "Apelsin", "Kartong", "ICA");
        System.out.println(minJuice.farg+"  "+minJuice.storlekLiter);
        minJuice.dricker(0.5);;
        System.out.println(minJuice.storlekLiter);
        System.out.println(minJuice.getHallbarhet());
    }
}
