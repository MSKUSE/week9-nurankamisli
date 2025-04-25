public  class Rectangle extends Shape implements Drawable{


    int sideA=0;
    int sideB=0;

    public Rectangle() {

    }
    public Rectangle(String color,int sideA, int sideB) {
        super(color);
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    public double perimeter() {
        return 2*(this.sideA+this.sideB);
    }

    public double area() {
        return sideA*sideB;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    public void draw() {
        System.out.println("A rectangle is drawn");
    }

}
