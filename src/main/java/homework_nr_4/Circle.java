package homework_nr_4;

public class Circle {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        double pi;
        double square;
        double area;

        pi = Math.PI;
        square = radius * radius;
        area = pi * square;

        System.out.println("Площадь круга с радиусом " + radius + " равна: " + area);
    }

    public static void main(String[] args) {
        Circle circle;
        circle = new Circle(5.0);

        circle.calculateArea();
    }
}