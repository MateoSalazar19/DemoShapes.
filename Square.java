public class Square extends Shape {
    private int width;
    
    public Square(int width){
        this.width = width;

    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
        
    }
    public int getHeight() {
        return width;
    }
    public void setHeight(int newHeight) {
        width = newHeight;
       
    }
    @Override
    public float getArea() {
        return(getHeight()*getWidth());
    }
    @Override
    public float getPerimeter(){
        return(getHeight()*2)+(getWidth()*2) ;
    }
}    
