package task1;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape {
    public Square(int w){
        width = w;
    }
    public void area(){
        width = width*width;
        System.out.println(width);
    }
}

class Circle extends Shape {
    public Circle(int w){
        width = w;
    }
    public void area() {
        double areaCircle = (double)Math.PI*(int)width*(int)width;
        System.out.println(areaCircle);
    }
}