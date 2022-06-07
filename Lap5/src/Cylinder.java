public abstract class Cylinder extends Circle{
    public double height = 8;

    public double getHeight(){
        return height;
    }
    public double volume=2*3.14*height*radius;

    public double getVolume() {
        return volume;
    }
    @Override
    public double getArea() {
        return area*2+volume;
    }
    @Override
    public String toString() {
        return null;
    }
}