public class Rectangle extends Square {
    private int height = 0;
    public Rectangle (int height , int width){
        super(width);
        this.height = height;
    }
    @Override
    public int getHeight() {
        return height;
    }
    @Override
    public void setHeight(int newHeight) {
        height = newHeight;
    }
    
}
