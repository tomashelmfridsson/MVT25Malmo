package oop.circle;

public class Circle {
    private double radie;

    public Circle(double radie){
        this.radie = radie;
    }

    public double area(){
        return radie*radie*Math.PI;
    }

    public double omkrets(){
        return 2*radie*3.14;
    }

    public boolean isBiggerThen(Circle circleIn){
        return (this.area() > circleIn.area());

//        if (this.area() > circleIn.area()) return true;
//        return false;
//
    }
}
