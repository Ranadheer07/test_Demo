package pack1;

public class Rectangle 
{
private int length;
private int width;
public Rectangle(int length, int width) 
{
	super();
	this.length = length;
	this.width = width;
}
public int getLength()
{
	return length;
}
public void setLength(int length)
{
	this.length = length;
}
public int getWidth()
{
	return width;
}
public void setWidth(int width)
{
	this.width = width;
}
public int findArea()
{
	return this.length*this.width;
}
public String toString()
{
	return "Area of Rectangle is "+findArea();
}
public boolean equals(Object obj)
{
	Rectangle r =(Rectangle)obj;
	return (this.length==r.length) && (this.width==r.width);
}
}
