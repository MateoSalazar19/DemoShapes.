import java.lang.Math;
public class Circle extends Shape {
    private int radius = 5;
    
    public Circle (int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    @Override
    public float getArea() {
        return (float)((getRadius()*getRadius())*Math.PI);
    }
    @Override
    public float getPerimeter(){
        return (float)(2*Math.PI*radius);
    }
    }


