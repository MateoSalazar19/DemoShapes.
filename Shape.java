 public abstract class Shape {
    private int x = 0;
    private int y = 0;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public abstract float getArea();
        
    public abstract float getPerimeter();

    }
    
