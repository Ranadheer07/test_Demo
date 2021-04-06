package pack1;

public class MainClassRectangle 
{
public static void main(String[] args)
{
Rectangle r1 = new Rectangle(9,8);
Rectangle r2 = new Rectangle(5 ,8);
System.out.println(r1.toString());
System.out.println(r2.toString());
System.out.println(r2.equals(r1));
}
}