package main.homework5.DZ1;

public class Rectangle extends Figure {

    private int side1;
    private int side2;


    public Rectangle(int side1, int side2)
    {

        this.side1 = side1;
        this.side2 = side2;
    }


    public int getSide1()
    {
        return side1;
    }

    public void setSide1(int side1)
    {
        this.side1 = side1;
    }

    public int getSide2()
    {
        return side2;
    }

    public void setSide2(int side2)
    {
        this.side2 = side2;
    }

    @Override
    public double area()
    {
        return this.side1 * this.side2;
    }

    @Override
    public double perimetr()
    {
        return 2 * (this.side1 + this.side2);
    }
}


