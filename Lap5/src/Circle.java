public abstract class Circle {
    public int radius=5;

    public int getRadius() {
        return radius;
    }


    public double area = 3.14*radius*radius;
    public double getArea(){
        return area;
    }

    public String color;
    public abstract String toString();
}
