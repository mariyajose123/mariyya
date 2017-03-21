import java.io.*;
//abstract class
abstract class Figure
{
int a,b;
Figure(int temp)
{
a=temp;
}
Figure(int temp1,int temp2)
{
a=temp1;
b=temp2;
}
abstract void calcarea();
}
//class Rectangle
class Rectangle extends Figure
{
int area;
Rectangle(int temp1,int temp2)
{
super(temp1,temp2);
}
void calcarea()
{
area=a*b;
System.out.println("Length anfd breadth:"+a+"   "+b);
System.out.println("Area of Rectangle="+area);
}
}
//class Square 
class Square extends Figure
{
int area;
Square(int temp)
{
super(temp);
}
void calcarea()
{
area=a*a;
System.out.println("Side of square:"+a);
System.out.println("Area of Square="+area);
}
}
class Shape
{
public static void main(String arg[])
{
Rectangle r1=new Rectangle(10,20);
r1.calcarea();
Square s1=new Square(20);
s1.calcarea();
}
} 
