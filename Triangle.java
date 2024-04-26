import java.lang.Math;
public class Triangle extends Shape {
     
    public Triangle(int newSide1, int newSide2, int newSide3){
        setSide1(newSide1);
        setSide2(newSide2);
        setSide3(newSide3);
    }
    private int[] sides = new int[3];
    
    
    public int getSide1() {
        return sides[0];
    }
    public void setSide1(int newSide1) {
        sides[0] = newSide1;
    }

    public int getSide2() {
        return sides[1];
    }
    public void setSide2(int newSide2) {
        sides[1] = newSide2;
    }
    public int getSide3() {
        return sides[2];
    }
    public void setSide3(int newSide3) {
        sides[2] = newSide3; 
    }
    @Override
    public float getArea() {
        float s = (float)(getSide1()+getSide2()+getSide3())/2;
        
        return (float)Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
}
    @Override
    public float getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }
}