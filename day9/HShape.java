
abstract class MyShape
{
	String name;
	public MyShape(String name){
		this.name = name;
	}
	public abstract void getArea();
	public abstract void getLength();
}
class Circle extends MyShape
{
	double r;
	public static final double PI = 3.14;
	public Circle(String name, double r){
		super(name);
		this.r = r;
	}
	public void getArea(){
		System.out.println(name + "的面积是：" + PI * r * r);
	}
	public void getLength(){
		System.out.println(name + "的周长是：" + 2 * PI * r);
	}
}
class Rect extends MyShape
{
	int width;
	int height;
	public Rect(String name, int width, int height){
		super(name);
		this.width = width;
		this.height = height;
	}
	public void getArea(){
		System.out.println(name + "的面积是：" + width * height);
	}
	public void getLength(){
		System.out.println(name + "的周长是：" + 2*(width + height));
	}
}
class Triangle extends MyShape
{
	double low;
	double height;
	public Triangle(String name,double low,double height){
		super(name);
		this.low = low;
		this.height = height;
	}
	public void getArea(){
		System.out.println(name + "的面积是：" + low * height / 2);
	}
	public void getLength(){}
	/*public void getLength(){
		double x = low *low + height * height,result;
		result = sqrt(x);
		System.out.println(name + "的周长是:" + result + low + height);
	}*/
}

class  HShape
{
	public static void main(String[] args) 
	{
		Circle c = new Circle("圆形",4.0);
		c.getArea();
		c.getLength();
		Rect r = new Rect("矩形",3,4);
		r.getArea();
		r.getLength();
		Triangle t = new Triangle("三角形",3,4);
		t.getArea();
		t.getLength();
	}
}
