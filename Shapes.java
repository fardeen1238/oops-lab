import java.util.*;
abstraction class shape
{
   public int x,y;
   public abstract void printArea();
}
class Rectanglel extends shape 
{
  public void printArea(){
    float area;
    area=x*y;
    System.out.println("Area of Rectangle is" +area);
  }
}
class Triangle extends shapes
{
   public void printArea()
   {
     float area;
     area=(x*y)/2;
     System.out.println("Area of Triangle is"+area);
    }
}
class Circle extends shapes
{
   public void printArea()
   {
     float area;
     area=(22*x*x)/7;
     System.out.println("Area of Circle is"+area);
    }
}
public class Shapes
{
   public static void main(String[]args);
   {
     scanner sc=new scanner(system.in);
     System.out.println("Enter values :");
     int x1=sc.nextInt();
     int y1=sc.nextInt();
     Rectanglel r=newRectangle1();
     r.x=x1;r.y=y1;r.printArea();
     Traingle t=new Traingle();
     t.x=x1;t.y=y1;t.printArea();
     Circle c=new Circle();
     c.x=x1;
     c.printArea();
   }
}