package oop.circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circleSmall = new Circle(25);
        Circle circleBig = new Circle(7);

        System.out.println("Areor är:");
        System.out.println("Small: "+circleSmall.area());
        System.out.println("Big:"+circleBig.area());
//        if  (circleBig.area() > circleSmall.area()) {
//            System.out.println("Circle Big är större än Small");
//        }
        System.out.println("Circle Big är större än Small: "+circleBig.isBiggerThen(circleSmall));

        System.out.println(("Omkretsarna är:"));
        System.out.println("Small: "+circleSmall.omkrets());
        System.out.println("Big: "+circleBig.omkrets());

    }
}
