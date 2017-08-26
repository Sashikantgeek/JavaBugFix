class Product 
{
	private int id;
	private String name;
	private float price;
	Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Product(int id,String name,float price)
	{
		this(id,name);
		this.price=price;
	}
	void printProduct()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
}
class ConstructorTest7
{
	public static void main(String[] args) 
	{
		Product p1=new Product(101,"Mouse",500f);
		Product p2=new Product(102,"keyboard",500f);
		p1.printProduct();
		p2.printProduct();
	}
}
