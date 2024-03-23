package main.homework5.DZ1;

public class Square extends Rectangle {

    public Square(int side1)
    {
        super(side1, side1);
    }

    @Override
    public void setSide1(int side1)
    {
        super.setSide1(side1);
        super.setSide2(side1);
    }

    @Override
    public void setSide2(int side2)
    {
        super.setSide2(side2);
        super.setSide2(side2);
    }


}
