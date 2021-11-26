package additions;


class Rectangle {
    protected int height, width;
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int area() {
        return width*height;
    }
}


class Square extends Rectangle{
    @Override
    public void setHeight(int height){
        this.height = height;
        this.width = height;
    }
    @Override
    public void setWidth(int width){
        this.width = width;
        this.height = width;
    }
}


public class Liskov {
    public static int func(Rectangle rectangle){
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        return rectangle.area();
    }
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println(func(rectangle));
        System.out.println(func(square));
    }
}
