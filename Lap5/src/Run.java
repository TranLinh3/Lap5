public class Run {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder() {
            @Override
            public double getArea() {
                return super.getArea();
            }
        };
        System.out.println(cylinder.getArea());
    }
}