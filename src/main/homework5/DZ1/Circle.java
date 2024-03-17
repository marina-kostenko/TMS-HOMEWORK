package main.homework5.DZ1;

public class Circle extends Figure {

    private int r;

    public Circle(int r)
    {
        this.r = r;
    }


    @Override
    public double area()
    {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double perimetr()
    {
        return 2 * Math.PI * this.r;
    }
}
