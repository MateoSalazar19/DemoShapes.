public class Ellipse extends Circle {
    private int radius2 = 0;
    
    public Ellipse (int radius, int radius2){
        super(radius);
        this.radius2= radius2;
    }


    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int newRadius2) {
        radius2 = newRadius2;
    }
    public float getArea(){
        return (float)Math.PI*getRadius()*getRadius2();
    }
    public float getPerimeter(){
        float raiz = (float)Math.sqrt(((3*getRadius())+getRadius2())*(getRadius()+(3*getRadius2())));
        return (float)(Math.PI*(3*(getRadius()+getRadius2())-(raiz)));
    }
}
