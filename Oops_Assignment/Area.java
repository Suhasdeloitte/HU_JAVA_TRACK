public class Area {
    void calAreaSquare(double a) {
        System.out.println("Area of Square is: " + a * a + " sq unit");
    }

    void calAreaRectangle(double a, double b) {
        System.out.println("Area of Rectangle is: " + a * b + " sq unit");
    }

    void calAreaTriangle(double a, double b) {
        double tri = a * b * 1 / 2;
        System.out.println("Area of Triangle is: " + tri + " sq unit");
    }

    void calAreaCircle(double a) {
        double ar = 3.142 * a * a;
        System.out.println("Area of Circle is: " + ar + " sq unit");
    }

    public static void main(String[] args) {
        Area calc = new Area();
        calc.calAreaSquare(2);
        calc.calAreaRectangle(2, 4);
        calc.calAreaTriangle(3, 6);
        calc.calAreaCircle(3);

    }

}