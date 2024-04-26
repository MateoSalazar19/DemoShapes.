public class test4 extends Terminal {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Square(5),
            new Square(7),
            new Square(10),
            new Rectangle(6,4),
            new Rectangle(8, 2),
            new Rectangle(9, 3),
            new Circle(3),
            new Circle(4),
            new Circle(5),
            new Ellipse(5, 3),
            new Ellipse(6,2),
            new Ellipse(7, 4),
            new Triangle(3,4,5),
            new Triangle(7,8,10),
            new Triangle(6,7,8)
        };
        float areaTotal = 0, perimeterTotal = 0;
        for (Shape shape: shapes){
            areaTotal += shape.getArea();
            perimeterTotal += shape.getPerimeter();
        }
        for (Shape shape: shapes){
            Console.writeLine("Area: %.2f",shape.getArea());
            Console.writeLine("Perimeter: %.2f ",shape.getPerimeter());
        }
        printLine("Area Total = %.2f, Perimetro Total = %.2f " , areaTotal , perimeterTotal);

    }
}
